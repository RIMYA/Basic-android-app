package com.example.oel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText email,pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email= (EditText) findViewById(R.id.txtEmail);
        pwd= (EditText) findViewById(R.id.txtPass);

    }

    public void onLoginClicked(View view) {
        if(email.getText().toString().equals("abc@gmail.com") &&
                pwd.getText().toString().equals("12345")) {
            Intent intent = new Intent(this, SignInActivity.class);
            startActivity(intent);
        }
        else if(email.getText().toString().equals("")||
                pwd.getText().toString().equals(""))
        {
            Toast.makeText(getApplicationContext(), "Fill the above fields",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(getApplicationContext(), "Invalid Credentials",Toast.LENGTH_SHORT).show();
        }
    }

}
