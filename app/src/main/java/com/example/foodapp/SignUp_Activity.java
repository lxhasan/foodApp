package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

public class SignUp_Activity extends AppCompatActivity {

    private ImageView imageView;
    private EditText UserName,PhoneNumber,GmailID;
    private LoginButton insertButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

       /* imageView= findViewById(R.id.profile_image);

        UserName= findViewById(R.id.editTextTextPersonName);
        PhoneNumber= findViewById(R.id.editTextPhone);
        GmailID= findViewById(R.id.editTextTextEmailAddress);

        insertButton = findViewById(R.id.textView5);

        CallbackManager callbackManager = CallbackManager.Factory.create();


        insertButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                //UserName.setVisibility(View.VISIBLE);
               // UserName.setText("User ID : "+LoginResult.getAccessToken().getUserid());
               // String imageURL = "https://graph.facebook.com/" + LoginResult.getAccessToken();

                Log.d("Demo","login Successfully");
            }

            @Override
            public void onCancel() {

                Log.d("Demo","login cuncled");
            }

            @Override
            public void onError(FacebookException error) {
                Log.d("Demo","login error");
            }
        });


        */
    }
}