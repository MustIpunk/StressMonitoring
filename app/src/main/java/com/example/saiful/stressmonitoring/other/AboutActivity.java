package com.example.saiful.stressmonitoring.other;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toolbar;

import com.example.saiful.stressmonitoring.R;

public class AboutActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Tentang");

        TextView tvParagraf1 = findViewById(R.id.tv_paragraf1);
        tvParagraf1.setText(R.string.paragraf1);
    }
}