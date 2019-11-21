package com.example.topic4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ListView Countries;
public static  String countries[]={
        "Nepal","India","China","Uk"
};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView Countries =findViewById(R.id.Countries);

        ArrayAdapter countryAdapter =new ArrayAdapter<>(

                this,
                android.R.layout.simple_list_item_1,
                countries
        );
        Countries.setAdapter(countryAdapter);
    }
}
