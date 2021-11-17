package com.example.fechahora;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    EditText etFecha, etHora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFecha = findViewById(R.id.etFecha);
        etHora = findViewById(R.id.etHora);
    }

    public void defineFecha (View v){

        DatePickerDialog dialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                etFecha.setText(dayOfMonth + "-" + (month+1) + "-" + year);
            }
        }, 2021, 0, 1);
        dialog.show();
    }

    public void definaHora (View v){
        TimePickerDialog  dialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                etHora.setText(hourOfDay + ":" + minute);
            }
        }, 10, 30, true);
        dialog.show();
    }
}