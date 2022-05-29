package com.example.oel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class GarageActivity extends AppCompatActivity {
    Switch switch1; Button submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garage);
        Intent intent5 = getIntent();
        switch1 = (Switch) findViewById(R.id.switch1);
        submit = (Button) findViewById(R.id.submitButton);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String statusSwitch1, statusSwitch2;
                if (switch1.isChecked())
                    statusSwitch1 = switch1.getTextOn().toString();
                else
                    statusSwitch1 = switch1.getTextOff().toString();
                if (switch1.isChecked())
                    statusSwitch2 = switch1.getTextOn().toString();
                else
                    statusSwitch2 = switch1.getTextOff().toString();
                Toast.makeText(getApplicationContext(), "Door :" + statusSwitch1 , Toast.LENGTH_LONG).show(); // display the current state for switch's
            }
        });
    }





}