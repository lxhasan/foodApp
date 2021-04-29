package com.example.foodapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.foodapp.Adapters.MainAdapter;
import com.example.foodapp.Models.MainModels;
import com.example.foodapp.databinding.ActivityDashBordBinding;

import java.util.ArrayList;

public class DashBord extends AppCompatActivity {

    ActivityDashBordBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDashBordBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<MainModels> list = new ArrayList<>();

        list.add(new  MainModels(R.drawable.burger ,"Burger","5","Chicken Burger with Cheese"));
        list.add(new  MainModels(R.drawable.pizza ,"Pizza","10","crown and chicken norwich"));
        list.add(new  MainModels(R.drawable.icecream ,"Icecram","12","vanilla flavour with chocolate syrup"));
        list.add(new  MainModels(R.drawable.salad ,"Salad","0","The offer to download the copouns thusday May 28"));
        list.add(new  MainModels(R.drawable.toast ,"Toast Bread","9","Toast bread with blueberry on black plate."));
        list.add(new  MainModels(R.drawable.baked ,"Baked Pancakes","0","The offer to download the copouns thusday May 30"));
        list.add(new  MainModels(R.drawable.cake ,"Respberry Cake","20","The offer UP to 20% thusday May 28"));
        list.add(new  MainModels(R.drawable.pancakes ,"Panacakes","20","Blue and whit ceramic plate with pancakes"));
        list.add(new  MainModels(R.drawable.icecream ,"Icecram","12","vanilla flavour with chocolate syrup"));

        MainAdapter adapter = new MainAdapter(list,this);
        binding.recyclerViewID.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recyclerViewID.setLayoutManager(layoutManager);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.orders:
                startActivity(new Intent(DashBord.this,OrderActivity.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}