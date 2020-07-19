package com.example.transglobal.doc_talk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Signin extends AppCompatActivity {

    Button signin;
   public TextView register,forgetpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in);

        signin=findViewById(R.id.Sign_in);
        register=findViewById(R.id.register_text);
        forgetpass=findViewById(R.id.forgetpass);

    }


    public void Register(View view) {

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Signin.this,RegisterActivity.class);
                startActivity(in);
            }
        });

    }


    public void Forgetpass(View view) {

        forgetpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Signin.this,ForgetPassword.class);
                startActivity(i);
            }
        });
    }
}