package com.example.vaccinesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.vaccinesapp.adapter.CountryAdapter;
import com.example.vaccinesapp.model.CountryInfo;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        CountryInfo[] vaccineInfos = {
                new CountryInfo(R.drawable.argentina, "Argentina"),
                new CountryInfo(R.drawable.canada, "Canada"),
                new CountryInfo(R.drawable.germany, "Germany"),
                new CountryInfo(R.drawable.france, "France"),
                new CountryInfo(R.drawable.netherlands, "Netherlands"),
                new CountryInfo(R.drawable.turkey, "Turkey"),
                new CountryInfo(R.drawable.argentina, "Argentina"),
                new CountryInfo(R.drawable.canada, "Canada"),
                new CountryInfo(R.drawable.germany, "Germany"),
                new CountryInfo(R.drawable.france, "France"),
                new CountryInfo(R.drawable.netherlands, "Netherlands"),
                new CountryInfo(R.drawable.turkey, "Turkey")
        };
        CountryAdapter countryAdapter = new CountryAdapter(vaccineInfos);
        recyclerView.setAdapter(countryAdapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }


}