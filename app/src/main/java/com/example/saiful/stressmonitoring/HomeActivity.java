package com.example.saiful.stressmonitoring.other;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.saiful.stressmonitoring.GejalaActivity;
import com.example.saiful.stressmonitoring.jenis.JenisActivity;
import com.example.saiful.stressmonitoring.R;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textView;
    ImageView imageViewMore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        if (getSupportActionBar() != null){
            getSupportActionBar().hide();
        }
        //set style font
        textView = findViewById(R.id.tv_miqyas);
        Typeface customFont = Typeface.createFromAsset(getAssets(), "font/amsterdam.ttf");
        textView.setTypeface(customFont);
        //inisiasi
        ImageView imgGejala = findViewById(R.id.iv_gejala);
        imgGejala.setOnClickListener(this);

        ImageView imgJenisStres = findViewById(R.id.iv_jenisStres);
        imgJenisStres.setOnClickListener(this);

        ImageView imgKonsultasi = findViewById(R.id.iv_konsultasi);
        imgKonsultasi.setOnClickListener(this);

        imageViewMore = findViewById(R.id.iv_more);
        imageViewMore.setOnClickListener(this);
    }
    //Alert exit
    @Override
    public void onBackPressed() {
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Apakah kamu ingin keluar?");
        builder.setCancelable(true);
        builder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_gejala:
                Intent intentGejala = new Intent(HomeActivity.this, GejalaActivity.class);
                startActivity(intentGejala);
                break;
            case R.id.iv_jenisStres:
                Intent intentJenisStres = new Intent(this, JenisActivity.class);
                startActivity(intentJenisStres);
                break;
            case R.id.iv_more:
                Intent intentMore = new Intent(this, OtherActivity.class);
                startActivity(intentMore);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                break;
        }
    }

}