package com.example.saiful.stressmonitoring.other;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.saiful.stressmonitoring.R;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;

public class GuideActivity extends AppCompatActivity implements View.OnClickListener  {
    LinearLayout lyChat, lyEmail, lyCall;
    GoogleMap googleMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);

        /*SupportMapFragment supportMapFragment = (SupportMapFragment)
        getSupportFragmentManager().findFragmentById(R.id.google_map);
        supportMapFragment.getMapAsync(this);
        */
        getSupportActionBar().setTitle("Bantuan");
        lyChat = findViewById(R.id.chat);
        lyChat.setOnClickListener(this);

        lyEmail = findViewById(R.id.email);
        lyEmail.setOnClickListener(this);

        lyCall = findViewById(R.id.call);
        lyCall.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.call:
                Uri number = Uri.parse("tel:087886451248");
                Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                startActivity(callIntent);
                break;
            case R.id.email:
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:Ditanursekarsari16@gmail.com")); // only email apps should handle this
                intent.putExtra(Intent.EXTRA_EMAIL, "email");
                intent.putExtra(Intent.EXTRA_SUBJECT, "subject");
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                    break;
                }
            case R.id.chat:
                String url = "https://api.whatsapp.com/send?phone="+ "+6287886451248";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
                break;
        }
    }
}