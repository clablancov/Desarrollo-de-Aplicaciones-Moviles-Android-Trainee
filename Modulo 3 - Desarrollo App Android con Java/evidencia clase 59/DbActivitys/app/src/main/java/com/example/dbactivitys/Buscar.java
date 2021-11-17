package com.example.dbactivitys;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Buscar extends AppCompatActivity {

    EditText etbuscar;
    TextView tvCodigo, tvNombre, tvPrecio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar);

        etbuscar = findViewById(R.id.etBuscar);
        tvCodigo = findViewById(R.id.tvCodigo);
        tvNombre = findViewById(R.id.tvNombre);
        tvPrecio = findViewById(R.id.tvPrecio);
    }

    public void buscarProducto(View v){
        Admindb conex = new Admindb(this, "Productos", null, 1);
        SQLiteDatabase bd = conex.getWritableDatabase();

        String codigo = etbuscar.getText().toString();

        if(!codigo.isEmpty()){
            Cursor fila = bd.rawQuery("select nombre, precio from producto where codigo="+codigo, null);

            if (fila.moveToFirst()){
                tvCodigo.setText("Codigo: " + etbuscar);
                tvNombre.setText("Nombre: " + fila.getString(0));
                tvPrecio.setText("Precio: " + fila.getString(1));
                conex.close();
            }
            else {
                Toast.makeText(this, "producto no esta registrado", Toast.LENGTH_LONG).show();
            }
        }
        else {
            Toast.makeText(this, "Debe ingresar un codigo de producto!!", Toast.LENGTH_LONG).show();
        }
    }
}