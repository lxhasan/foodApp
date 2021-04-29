package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.foodapp.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {

    ActivityDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

         DBHelper helper = new DBHelper(this);

        if (getIntent().getIntExtra("type", 0) == 1) {

            final int image = getIntent().getIntExtra("image", 0);
            final int price = Integer.parseInt(getIntent().getStringExtra("price"));
            final String name = getIntent().getStringExtra("name");
            final String description = getIntent().getStringExtra("desc");
            final String foodName = getIntent().getStringExtra("foodName");

            binding.deatilImageID.setImageResource(image);
            binding.priceID.setText(String.format("%d", price));
            binding.textView7.setText(name);
            binding.detelDricpation.setText(description);


            binding.insertButtonID.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    boolean isInserted = helper.insertOrder(
                            binding.nameBoxID.getText().toString(),
                            binding.phoneBoxID.getText().toString(),
                            price,
                            image,
                            name,
                            description,
                            Integer.parseInt(binding.quantityID.getText().toString())
                    );

                    if (isInserted)
                        Toast.makeText(DetailActivity.this, "Data saved successfully", Toast.LENGTH_SHORT).show();

                    else
                        Toast.makeText(DetailActivity.this, "Error", Toast.LENGTH_SHORT).show();


                }
            });
        } else {

               int id =getIntent().getIntExtra("id",0);



                Cursor cursor = helper.getOrderbyID(id);
              // final int image = cursor.getInt(4);

                binding.deatilImageID.setImageResource(cursor.getInt(4));
                binding.priceID.setText(String.format("%d", cursor.getInt(3)));
                binding.textView7.setText(cursor.getString(6));
                binding.detelDricpation.setText(cursor.getString(5));

                binding.nameBoxID.setText(cursor.getString(1));
                binding.phoneBoxID.setText(cursor.getString(2));
                binding.insertButtonID.setText("Update Now");
                binding.insertButtonID.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                         boolean isUpdate = helper.updateOrder(
                                binding.nameBoxID.getText().toString(),
                                binding.phoneBoxID.getText().toString(),
                                Integer.parseInt(binding.priceID.getText().toString()),
                                binding.deatilImageID.getImageAlpha(),
                                binding.detelDricpation.getText().toString(),
                                binding.textView7.getText().toString(),
                                1,
                                id

                        );
                         if (isUpdate == true)
                             Toast.makeText(DetailActivity.this, "Update", Toast.LENGTH_SHORT).show();
                         else
                             Toast.makeText(DetailActivity.this, "Error", Toast.LENGTH_SHORT).show();
                    }
                });

        }
    }

}