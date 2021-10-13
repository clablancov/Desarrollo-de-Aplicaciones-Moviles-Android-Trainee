package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    private ImageView imgAvatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iniciaWidgets();
        cargarImagen();

    }

    private void iniciaWidgets(){
        imgAvatar = findViewById(R.id.img_imagen1);
    }

    private void cargarImagen(){
        Picasso.get()
                .load("https://diariocorreo.pe/resizer/E9dB6CWyeBMwLA0UFglLa_UO51g=/580x330/smart/filters:format(jpeg):quality(75)/arc-anglerfish-arc2-prod-elcomercio.s3.amazonaws.com/public/XTC6JIK4YRB7HILHDSINRGHLW4.jpg")
                .into(imgAvatar);
    }
}