package com.example.transglobal.doc_talk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView E1,E2;
    private ImageView Im1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro2);

        Im1=findViewById(R.id.img2);
        E1=findViewById(R.id.txt12);
        E1=findViewById(R.id.txt22);


    }
}