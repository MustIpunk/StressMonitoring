package com.example.saiful.stressmonitoring;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.saiful.stressmonitoring.other.HomeActivity;

public class GejalaActivity extends AppCompatActivity  {

    private String[] dataGejala = {"Keletihan", "Detak jantung terasa lebih cepat", "Takut tanpa alasan yang jelas",
    "Mudah marah","Sulit untuk tidur","Bertindak berlebihan terhadap suatu situasi","Mudah Tersinggung", "Gelisah",
    "Hilangnya nafsu makan atau terus makan","Hilangnya rasa semangat untuk melakukan kegiatan","Sedih","Tertekan",
    "Putus asa", "Berkeringat berlebihan","Mood untuk beruba","Sulit untuk berkonsentrasi","Prestasi menurun",
    "Daya ingat menurun","Hilangnya rasa kepercayaan kepada orang lain","Hilangnya rasa humor"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gejala);

        getSupportActionBar().setTitle("Gejala");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ListView listView = findViewById(R.id.lv_gejala);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, dataGejala);
        listView.setAdapter(adapter);


    }


}