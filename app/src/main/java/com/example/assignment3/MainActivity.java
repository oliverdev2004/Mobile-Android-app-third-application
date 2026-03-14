package com.example.assignment3;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btntop,btnmid,btnbottom;



    private final ActivityResultLauncher<Intent> TopActivityLauncher=
            registerForActivityResult(new ActivityResultContracts.StartActivityForResult(),
                    result-> {
                        if (result.getResultCode() == RESULT_OK && result.getData() != null) {
                            Uri dataUri = result.getData().getData();
                            if (dataUri != null) {
                                String choice = dataUri.toString();
                                if(choice.equals("red")){
                                btntop.setBackgroundColor(Color.RED);
                                btntop.setText("");
                                }
                                if(choice.equals("blue")){
                                    btntop.setBackgroundColor(Color.BLUE);
                                    btntop.setText("");
                                }
                                if(choice.equals("green")){
                                    btntop.setBackgroundColor(Color.GREEN);
                                    btntop.setText("");
                                }

                            } else {
                                Log.e("ActivityResult", "Top_activity : dataUri is null");
                            }
                        } else {
                            Log.e("ActivityResult", "Top_activity : result is not Ok or data is null");
                        }
                    }
            );

    private final ActivityResultLauncher<Intent> MiddleActivityLauncher=
            registerForActivityResult(new ActivityResultContracts.StartActivityForResult(),
                    result-> {
                        if (result.getResultCode() == RESULT_OK && result.getData() != null) {
                            Uri dataUri = result.getData().getData();
                            if (dataUri != null) {
                                String choice = dataUri.toString();
                                if(choice.equals("White")){
                                    btnmid.setBackgroundColor(Color.WHITE);
                                    btnmid.setText("");
                                }
                                if(choice.equals("Green")){
                                    btnmid.setBackgroundColor(Color.GREEN);
                                    btnmid.setText("");
                                }
                                if(choice.equals("Yellow")){
                                    btnmid.setBackgroundColor(Color.YELLOW);
                                    btnmid.setText("");
                                }

                            } else {
                                Log.e("ActivityResult", "Middle Activity : dataUri is null");
                            }
                        } else {
                            Log.e("ActivityResult", "Middle Activity : result is not Ok or data is null");
                        }
                    }
            );

    private final ActivityResultLauncher<Intent> BottomActivityLauncher=
            registerForActivityResult(new ActivityResultContracts.StartActivityForResult(),
                    result-> {
                        if (result.getResultCode() == RESULT_OK && result.getData() != null) {
                            Uri dataUri = result.getData().getData();
                            if (dataUri != null) {
                                String choice = dataUri.toString();
                                if(choice.equals("Bleu")){
                                    btnbottom.setBackgroundColor(Color.BLUE);
                                    btnbottom.setText("");

                                }
                                if(choice.equals("Red")){
                                    btnbottom.setBackgroundColor(Color.RED);
                                    btnbottom.setText("");
                                }
                                if(choice.equals("Green")){
                                    btnbottom.setBackgroundColor(Color.GREEN);
                                    btnbottom.setText("");
                                }

                            } else {
                                Log.e("ActivityResult", "Middle Activity : dataUri is null");
                            }
                        } else {
                            Log.e("ActivityResult", "Middle Activity : result is not Ok or data is null");
                        }
                    }
            );


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btntop=(Button) findViewById(R.id.btn1);
        btnmid=(Button) findViewById(R.id.btn2);
        btnbottom=(Button) findViewById(R.id.btn3);
        btntop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this, Top_Activity.class);
                TopActivityLauncher.launch(i);
            }
        });

        btnmid.setOnClickListener(v->{
            Intent i=new Intent(MainActivity.this, Middle_Activity.class);
            MiddleActivityLauncher.launch(i);
        });
        btnbottom.setOnClickListener(v->{
            Intent i=new Intent(MainActivity.this, Bottom_Activity.class);
            BottomActivityLauncher.launch(i);
        });
    }
}