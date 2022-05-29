package com.example.oel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
public class RoomActivity extends AppCompatActivity {
    RadioButton radio_On;
    RadioButton radio_Off;
    RadioButton radio2_On;
    RadioButton radio2_Off;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);
        Intent intent3 = getIntent();
        radio_On = (RadioButton) findViewById(R.id.radio_On);
        radio_Off = (RadioButton) findViewById(R.id.radio_Off);
        radio_On = (RadioButton) findViewById(R.id.radio2_On);
        radio_Off = (RadioButton) findViewById(R.id.radio2_Off);
    }
    public void toastMsg(String msg) {
        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_LONG);
        toast.show();
    }
    public void displayToastMsg(View v) {
        toastMsg("Speech command recorded!");
    }
    public void onRadioButtonClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_On:
                if (checked) {
                    Toast.makeText(RoomActivity.this, "The AC is ON", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.radio_Off:
                if (checked) {
                    Toast.makeText(RoomActivity.this, "The AC door is OFF", Toast.LENGTH_SHORT).show();
                }
                break;

        }
    }
    public void onRadioButton2Clicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio2_On:
                if (checked) {
                    Toast.makeText(RoomActivity.this, "The led is ON", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.radio2_Off:
                if (checked) {
                    Toast.makeText(RoomActivity.this, "The led door is OFF", Toast.LENGTH_SHORT).show();
                }
                break;

        }
    }
}