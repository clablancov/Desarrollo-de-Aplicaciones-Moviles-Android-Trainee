package com.example.reforzamiento;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MasterOfPuppets";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        guardaLog("onCreate");
    }

    @Override
    protected void onStop(){
        guardaLog("onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy(){
        guardaLog("onDestroy");
        super.onDestroy();
    }

    @Override
    protected void onRestart(){
        guardaLog("onRestart");
        super.onRestart();
    }

    @Override
    protected void onPause(){
        guardaLog("onPause");
        super.onPause();
    }

    @Override
    protected void onResume(){
        guardaLog("onResume");
        super.onResume();
    }

    @Override
    protected void onStart(){
        guardaLog("onStart");
        super.onStart();
    }

    private void guardaLog(String NombreFuncion){
        Log.d(TAG, "Se lanzó metodo o función ----> " + NombreFuncion);
    }
}