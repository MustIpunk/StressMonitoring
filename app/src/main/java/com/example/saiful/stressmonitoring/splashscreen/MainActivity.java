package com.example.saiful.stressmonitoring.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;
import android.widget.Toolbar;

import com.example.saiful.stressmonitoring.other.HomeActivity;
import com.example.saiful.stressmonitoring.R;

public class MainActivity extends AppCompatActivity {
    private int loadingTime = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //change title
       // getSupportActionBar().setTitle("");
        //No ActionBar
        if (getSupportActionBar() != null){
            getSupportActionBar().hide();
        }
        //Change color action bar
       /** ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#FFFFFFFF"));
        getSupportActionBar().setBackgroundDrawable(colorDrawable);
       **/
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent home = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(home);
                finish();
            }
        },loadingTime);

        ProgressBar mProgressBar = (ProgressBar)findViewById(R.id.progressbar);
        ProgressBarAnimation progressBarAnimation =new ProgressBarAnimation(mProgressBar, 3000);

        progressBarAnimation.setProgress(100);
    }

}