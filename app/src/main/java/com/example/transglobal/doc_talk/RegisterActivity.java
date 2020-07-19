package com.example.transglobal.doc_talk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    Button createAccount;
    TextView signin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);


        createAccount=findViewById(R.id.create_account);
    }




    public void CreateAccount(View view) {

        createAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RegisterActivity.this,Verification_Code.class);
                startActivity(i);
            }
        });

    }

    public void signinFregister(View view) {
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(RegisterActivity.this,Signin.class);
                startActivity(i2);
            }
        });

    }
}