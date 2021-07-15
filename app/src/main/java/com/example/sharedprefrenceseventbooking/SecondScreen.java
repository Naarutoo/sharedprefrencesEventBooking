package com.example.sharedprefrenceseventbooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondScreen extends AppCompatActivity {
    public static final String FIRST_NAME ="name", LAST_NAME ="sirname", EMAIL_ID ="Email", PHONE_NO ="Phonenumber", SEATS ="Seats",DATE ="Date";
    TextView mtvFirstName, mtvLastname, mtvEmail;
    EditText metSeats, metDate;
 Button mbtnNext ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
        initviews();
    }

    private void initviews() {
        metSeats = findViewById(R.id.etSeats);
        metDate = findViewById(R.id.etDate);
        mtvFirstName = findViewById(R.id.tvFirstname);
        mtvLastname = findViewById(R.id.tvLastname);
        mtvEmail = findViewById(R.id.etEmail);
        mbtnNext = findViewById(R.id.btnNext2);
        mbtnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreference.writetoIntPreference(SecondScreen.this,SEATS,Integer.parseInt(metSeats.getText().toString()));
                SharedPreference.writetoStringPreference(SecondScreen.this,DATE,metDate.getText().toString());
                Intent intent = new Intent(SecondScreen.this,ThirrdScreen.class);
                startActivity(intent);
            }
        });
    }
    private void getSharedPreferenceData(){
String Name = SharedPreference.getStringSharedPrefernces(SecondScreen.this,FIRST_NAME);
String surName = SharedPreference.getStringSharedPrefernces(SecondScreen.this,LAST_NAME);
String Email = SharedPreference.getStringSharedPrefernces(SecondScreen.this,EMAIL_ID);

mtvFirstName.setText(Name);
mtvLastname.setText(surName);
mtvEmail.setText(Email);
    }
}