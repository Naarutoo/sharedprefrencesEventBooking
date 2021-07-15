package com.example.sharedprefrenceseventbooking;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ThirrdScreen extends AppCompatActivity {
    public static final String FIRST_NAME ="name", LAST_NAME ="sirname", EMAIL_ID ="Email", PHONE_NO ="Phonenumber", SEATS ="Seats",DATE ="Date";
TextView mtvFirstname, mtvLastName,mtvEmail,mtvSeats,mtvDate;
Button mbtnConfirm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirrd_screen);
        initviews();
        getSharedPreferenceData();

    }

    private void initviews() {
    mtvFirstname = findViewById(R.id.tvFirstname);
    mtvLastName = findViewById(R.id.tvLastname);
    mtvEmail = findViewById(R.id.tvEmail);
    mtvSeats = findViewById(R.id.tvSeats);
    mtvDate = findViewById(R.id.tvDate);
    mbtnConfirm.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
new AlertDialog.Builder(ThirrdScreen.this).setTitle("confirmation").setMessage("The event is confirmed on"+ mtvDate.getText().toString()).setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
    @Override
    public void onClick(DialogInterface dialog, int which) {

    }
}).show();
        }
    });

    }
    private void getSharedPreferenceData(){
        String name = SharedPreference.getStringSharedPrefernces(ThirrdScreen.this,FIRST_NAME);
        String surname = SharedPreference.getStringSharedPrefernces(ThirrdScreen.this,LAST_NAME);
        String email = SharedPreference.getStringSharedPrefernces(ThirrdScreen.this,EMAIL_ID);
        int noOfseats = SharedPreference.getIntfromSharedPrefernces(ThirrdScreen.this,SEATS);
        String date = SharedPreference.getStringSharedPrefernces(ThirrdScreen.this,DATE);

        mtvFirstname.setText(name);
        mtvLastName.setText(surname);
        mtvEmail.setText(email);
        mtvSeats.setText(noOfseats);
        mtvDate.setText(date);
    }
}