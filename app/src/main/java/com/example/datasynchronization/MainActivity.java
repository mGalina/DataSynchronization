package com.example.datasynchronization;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToSynchronization(View view) {
        Intent intent = new Intent(Intent.ACTION_SYNC);

        if (/*текущее время с 6:00 до 14:00*/) {
            intent.setData(Uri.parse("http://morning"));
        } else if (/*текущее время с 14:00 до 15:00*/) {
            intent.setData(Uri.parse("http://afternoon"));
        } else {
            intent.setData(Uri.parse("http://evening"));
        }

        startActivity(intent);
    }
}