package com.example.datasynchronization;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToSynchronization(View view) {
        Date currentDate = new Date();
        DateFormat timeFormat = new SimpleDateFormat("H", new Locale("ru", "RU"));
        int time = Integer.parseInt(timeFormat.format(currentDate));

        Intent intent = new Intent(Intent.ACTION_SYNC);

        if (time >= 6 && time < 14) {
            intent.setData(Uri.parse("http://morning"));
        } else if (time == 14) {
            intent.setData(Uri.parse("http://afternoon"));
        } else {
            intent.setData(Uri.parse("http://evening"));
        }
        startActivity(intent);
    }
}