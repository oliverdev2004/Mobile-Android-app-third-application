package com.example.assignment3;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Middle_Activity extends AppCompatActivity {

    Spinner sp1;
    Button set;
    String selectedColor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.middle_activity);
        sp1=(Spinner) findViewById(R.id.spinner);
        set=(Button)findViewById(R.id.button2);
        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                 selectedColor = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
               selectedColor = null;
            }
        });
        set.setOnClickListener(v -> {
            Intent j = new Intent();
            Uri data = Uri.parse(selectedColor);
            j.setData(data);
            setResult(RESULT_OK, j);
            finish();
        });


    }
}