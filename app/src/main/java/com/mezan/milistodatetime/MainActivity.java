package com.mezan.milistodatetime;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.SimpleDateFormat;
import android.icu.util.GregorianCalendar;
import android.icu.util.TimeZone;
import android.os.Bundle;
import android.util.Log;

import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        long ms = 1359256734;
        Date date = new Date(ms);
        SimpleDateFormat dateformat = new SimpleDateFormat("MMM dd, yyyy HH:mm:ss");
        System.out.println(dateformat.format(date));
        Log.d("Result : ",dateformat.format(date));
    }
}
