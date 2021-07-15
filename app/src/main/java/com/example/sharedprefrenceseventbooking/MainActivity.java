package com.example.sharedprefrenceseventbooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.preference.Preference;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private static final String FIRST_NAME ="Name", LAST_NAME = "sirname", EMAIL_ID ="Email", PHONE_NO = "Phone";
EditText metFirstname,metLastname,metEmail,metPhoneNumber;
Button mbtnNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initviews();

    }

    private void initviews() {
        metFirstname = findViewById(R.id.etFirstname);
        metLastname = findViewById(R.id.etLastname);
        metEmail = findViewById(R.id.etEmail);
        metPhoneNumber = findViewById(R.id.etPhoneNumber);
        mbtnNext = findViewById(R.id.btnNext);

        mbtnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           SharedPreference.writetoStringPreference(MainActivity.this,FIRST_NAME,metFirstname.getText().toString());
           SharedPreference.writetoStringPreference(MainActivity.this,LAST_NAME,metLastname.getText().toString());
           SharedPreference.writetoStringPreference(MainActivity.this,EMAIL_ID,metEmail.getText().toString());
           SharedPreference.writetoIntPreference(MainActivity.this,PHONE_NO,Integer.parseInt(metPhoneNumber.getText().toString()));

           Intent intent = new Intent(MainActivity.this,SecondScreen.class);
            startActivity(intent);
            }
        });
    }
}