package com.example.oel;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;


public class CCTVActivity extends AppCompatActivity {


        RadioButton r1, r2,r3,r4;
        Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cctvactivity);
        Intent intent2 = getIntent();
            // layout instances
            buttonSubmit = (Button) findViewById(R.id.btnSubmit);

            r1 = (RadioButton) findViewById(R.id.rb1);
            r2 = (RadioButton) findViewById(R.id.rb2);
            r3 = (RadioButton) findViewById(R.id.rb3);
            r4 = (RadioButton) findViewById(R.id.rb4);


            buttonSubmit.setOnClickListener(new View.OnClickListener() {

                                                @Override
                                                public void onClick(View v) {

                                                    // task 1 : multiple radio button selection
                                                    String yourVote = " ";

                                                    if (r1.isChecked()) {
                                                        yourVote += r1.getText().toString() + "\tYES";
                                                    }
                                                    else{
                                                        yourVote += r1.getText().toString() + "\tNO";
                                                    }

                                                    if (r2.isChecked()) {
                                                        yourVote += r2.getText().toString() + "\tYES";
                                                    }
                                                    else{
                                                        yourVote += r2.getText().toString() + "\tNO";
                                                    }

                                                    if (r3.isChecked()) {
                                                        yourVote += r3.getText().toString() + "\tYES";
                                                    }
                                                    else{
                                                        yourVote += r3.getText().toString() + "\tNO";
                                                    }

                                                    if (r4.isChecked()) {
                                                        yourVote += r4.getText().toString() + "\tYES";
                                                    }
                                                    else{
                                                        yourVote += r4.getText().toString() + "\tNO";
                                                    }



                                                    // display it as Toast to the user

                                                    Toast.makeText(CCTVActivity.this, "Selected Radio Button is:" + yourVote , Toast.LENGTH_LONG).show();

                                                }
                                            }
            );
        }
    }


