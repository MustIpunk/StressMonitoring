package com.example.saiful.stressmonitoring.other;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.saiful.stressmonitoring.R;

public class OtherActivity extends AppCompatActivity implements View.OnClickListener {
    LinearLayout linearLayout, linearAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Lainnya");
        actionBar.setDisplayHomeAsUpEnabled(true);

        linearLayout = findViewById(R.id.guide);
        linearLayout.setOnClickListener(this);
        linearAbout = findViewById(R.id.about);
        linearAbout.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.guide:
                Intent intent1 = new Intent(this, GuideActivity.class);
                startActivity(intent1);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                break;
            case R.id.about:
                Intent intentAbout = new Intent(this, AboutActivity.class);
                startActivity(intentAbout);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                break;
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

}