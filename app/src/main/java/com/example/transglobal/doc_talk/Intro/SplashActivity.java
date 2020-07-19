package com.example.transglobal.doc_talk.Intro;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.transglobal.doc_talk.R;

import androidx.appcompat.app.AppCompatActivity;

class SplashActivity extends AppCompatActivity implements Splash_Contract.SplashView {

    Splash_Presenter SPresenter;
    private ImageView img;
    private TextView txt1,txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        SPresenter = new Splash_Presenter(this);
    }

    @Override
    public void SetupUI() {


    }

    @Override
    public void BottomArrowPressed() {

    }

    @Override
    public void OpenMainActivity() {

    }
}
