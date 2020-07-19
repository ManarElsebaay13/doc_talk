package com.example.transglobal.doc_talk.Intro;

interface Splash_Contract {



    interface SplashView{


       void SetupUI();
       void BottomArrowPressed();
       void OpenMainActivity();

    }



    interface SplashPresenter{

        void goToNextActivity();

    }




}
