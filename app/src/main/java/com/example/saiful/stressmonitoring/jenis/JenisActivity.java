package com.example.saiful.stressmonitoring.jenis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.widget.ListView;

import com.example.saiful.stressmonitoring.R;

import java.util.ArrayList;

public class JenisActivity extends AppCompatActivity {
    private SetresAdapter adapter;
    private String[] dataName;
    private String[] dataDescription;
    private TypedArray dataPhoto;
    private ArrayList<Setres> setres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jenis);
        getSupportActionBar().setTitle("Jenis Stres");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ListView listView = findViewById(R.id.lv_jenis);
        adapter = new SetresAdapter(this);
        listView.setAdapter(adapter);

        prepare();
        addItem();
    }
    private void prepare(){
        dataName = getResources().getStringArray(R.array.data_name);
        dataDescription = getResources().getStringArray(R.array.data_description);
        dataPhoto = getResources().obtainTypedArray(R.array.data_photo);
    }
    private void addItem() {
        setres = new ArrayList<>();
        for (int i = 0; i < dataName.length; i++) {
            Setres hero = new Setres();
            hero.setPhoto(dataPhoto.getResourceId(i, -1));
            hero.setName(dataName[i]);
            hero.setDescription(dataDescription[i]);
            setres.add(hero);
        }
        adapter.setSetress(setres);
    }
}