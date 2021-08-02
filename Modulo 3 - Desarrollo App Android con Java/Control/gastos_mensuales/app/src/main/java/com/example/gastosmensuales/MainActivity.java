package com.example.gastosmensuales;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    Spinner servicios;
    EditText fecha, monto;
    ArrayList<String> listaServicios;
    ArrayList<Servicios> ALServicios;
    int servicioSelected = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        servicios = findViewById(R.id.spServicios);

        fecha = findViewById(R.id.etFecha);
        monto = findViewById(R.id.etMonto);

        consultarServicios();
        ArrayAdapter<CharSequence> adaptador = new ArrayAdapter(this, android.R.layout.simple_spinner_item, listaServicios);

        servicios.setAdapter(adaptador);

        servicios.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position != 0){
                    servicioSelected = ALServicios.get(position-1).getId();
                }
                else{
                    servicioSelected = 0;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void crearGasto(View v){
        Admindb conex = new Admindb(this, "Gastos", null, 1);
        SQLiteDatabase bd = conex.getWritableDatabase();

        String fechaGasto = fecha.getText().toString();
        int montoGasto = Integer.parseInt(monto.getText().toString());

        if(servicioSelected != 0 && !fechaGasto.isEmpty() && montoGasto > 0){
            ContentValues crear = new ContentValues();
            crear.put("servicio", servicioSelected);
            crear.put("fecha", fechaGasto);
            crear.put("monto", montoGasto);

            bd.insert("registro_gastos", null, crear);
            bd.close();
            fecha.setText("");
            monto.setText("");
            servicios.setSelection(0);

            Toast.makeText(this, "Gasto Ingresado correctamente", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(this, "Debe ingresar todos los campos!", Toast.LENGTH_LONG).show();
        }

    }

    private void consultarServicios() {
        Admindb conex = new Admindb(this, "Gastos", null, 1);
        SQLiteDatabase bd = conex.getReadableDatabase();

        Servicios servicio = null;
        ALServicios = new ArrayList<Servicios>();

        Cursor cursor = bd.rawQuery("SELECT rowid, nombre FROM servicios", null);

        while(cursor.moveToNext()){
            servicio = new Servicios();
            servicio.setId(cursor.getInt(0));
            servicio.setNombre(cursor.getString(1));

            ALServicios.add(servicio);
        }
        obtenerLista();
    }

    private void obtenerLista() {
        listaServicios = new ArrayList<String>();
        listaServicios.add("Seleccione...");

        for(int i = 0; i < ALServicios.size(); i++){
            listaServicios.add(ALServicios.get(i).getId() + " - " + ALServicios.get(i).getNombre());
        }
    }

    public void defineFecha (View v){
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH);
        int day = now.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog dialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                fecha.setText(dayOfMonth + "-" + (month+1) + "-" + year);
            }
        }, year, month, day);
        dialog.show();
    }

    public void nuevoServicio(View v){
        Intent nvoServicio = new Intent(this, NvoServicio.class);
        startActivity(nvoServicio);
    }

    public void homeBack(View v){
        Intent welcomeBack = new Intent(this, Home.class);
        startActivity(welcomeBack);
    }
}