package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Singin_activity extends AppCompatActivity {

    EditText userEditText,passwordEdittext;
    TextView creatTextViwe;
    Button signButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singin_activity);

        if (getSupportActionBar() != null)
            getSupportActionBar().setTitle("SinG in");


        creatTextViwe = findViewById(R.id.createtextViewID);
        userEditText = findViewById(R.id.emailEditID);
        passwordEdittext = findViewById(R.id.PasswordEditID);
        signButton = findViewById(R.id.signButtonID);
        signButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String username = userEditText.getText().toString();
                String password = passwordEdittext.getText().toString();

                if (username.equals("admin") && password.equals("9876"))
                {

                    Intent intent = new Intent(Singin_activity.this,DashBord.class);
                    startActivity(intent);

                }else {
                    Toast.makeText(getApplicationContext(),"The User name or Password that you've entered is incorrect,", Toast.LENGTH_SHORT).show();
                }




               
            }
        });
    }
}