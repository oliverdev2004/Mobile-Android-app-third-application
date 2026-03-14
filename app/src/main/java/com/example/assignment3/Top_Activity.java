package com.example.assignment3;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Top_Activity extends AppCompatActivity
{
    Button btnred,btnblue,btngreen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.top_activity);
        btnred=(Button)findViewById(R.id.btn1top);
        btnblue=(Button)findViewById(R.id.btn2top);
        btngreen=(Button)findViewById(R.id.btn3top);

        btnred.setOnClickListener(v->{

                String s = "red";
                Intent j = new Intent();//NO ARGS
                Uri data = Uri.parse(s);
                j.setData(data);
                //j.setData(Uri.parse(ed1.getText().toString()));
                setResult(RESULT_OK, j);// the op was successful otherwise it may be : RESULT_CANCELED
                finish();// to terminate the current activity and land back in the MainActivity
                //inside the onActivityResult

        });
        btnblue.setOnClickListener(v->{

            String s = "blue";
            Intent j = new Intent();//NO ARGS
            Uri data = Uri.parse(s);
            j.setData(data);
            //j.setData(Uri.parse(ed1.getText().toString()));
            setResult(RESULT_OK, j);// the op was successful otherwise it may be : RESULT_CANCELED
            finish();// to terminate the current activity and land back in the MainActivity
            //inside the onActivityResult

        });

        btngreen.setOnClickListener(v->{
            String s = "green";
            Intent j = new Intent();//NO ARGS
            Uri data = Uri.parse(s);
            j.setData(data);
            //j.setData(Uri.parse(ed1.getText().toString()));
            setResult(RESULT_OK, j);// the op was successful otherwise it may be : RESULT_CANCELED
            finish();// to terminate the current activity and land back in the MainActivity
            //inside the onActivityResult

        });



    }

}