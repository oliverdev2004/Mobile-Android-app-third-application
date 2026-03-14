package com.example.assignment3;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Bottom_Activity extends AppCompatActivity {
    RadioGroup rG;
    Button set;
    String selectedcolor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.bottom_activity);
        rG=(RadioGroup)findViewById(R.id.radioGroup);
        set=(Button) findViewById(R.id.button);

        set.setOnClickListener(v -> {

            int selectedId = rG.getCheckedRadioButtonId();

            if (selectedId == R.id.radioButton) {
                selectedcolor = "Bleu";
            }

            if (selectedId == R.id.radioButton2) {
                selectedcolor = "Red";
            }

            if (selectedId == R.id.radioButton3) {
                selectedcolor = "Green";
            }
            if (selectedcolor!=null) {
                Intent j = new Intent();
                j.setData(Uri.parse(selectedcolor));
                setResult(RESULT_OK, j);
                finish();
            }
            else{
                Toast.makeText(Bottom_Activity.this, "You must select a color", Toast.LENGTH_SHORT).show();
            }

        });
    }
}

