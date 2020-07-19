package com.example.transglobal.doc_talk.Login;

import android.os.Bundle;

import com.example.transglobal.doc_talk.Login.Login_Presenter;
import com.example.transglobal.doc_talk.R;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity implements Login_Contract.LoginView {


    private Login_Presenter LoPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        LoPresenter = new Login_Presenter(this);
    }


    @Override
    public void SetupView() {

    }

    @Override
    public void Login() {

    }
}
