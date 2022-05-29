package com.example.oel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class SignInActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        Intent intent = getIntent();


        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView);
        textView.setText("Sign In Successful");



    }
    public void onCctvClick(View view) {

        Intent intent2 = new Intent(this, CCTVActivity.class);
        startActivity(intent2);

    }
    public void onRoomClick(View view) {

        Intent intent3 = new Intent(this, RoomActivity.class);
        startActivity(intent3);

    }
    public void onCarClick(View view) {

        Intent intent4 = new Intent(this, CarActivity.class);
        startActivity(intent4);

    }
    public void onGarageClick(View view) {

        Intent intent5 = new Intent(this, GarageActivity.class);
        startActivity(intent5);

    }
}