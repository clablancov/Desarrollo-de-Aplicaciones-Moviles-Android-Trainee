package com.example.dbactivitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Insertar extends AppCompatActivity {

    EditText etCodigo, etNombre, etPrecio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insertar);

        etCodigo = findViewById(R.id.codigoProducto);
        etNombre = findViewById(R.id.nombreProducto);
        etPrecio = findViewById(R.id.precioProducto);
    }

    public void crearProducto(View v) {
        Admindb conex = new Admindb(this, "Productos", null, 1);
        SQLiteDatabase bd = conex.getWritableDatabase();

        String codigo = etCodigo.getText().toString();
        String nombre = etNombre.getText().toString();
        String precio = etPrecio.getText().toString();

        if (!codigo.isEmpty() && !nombre.isEmpty() && !precio.isEmpty()) {
            ContentValues crear = new ContentValues();
            crear.put("codigo", codigo);
            crear.put("nombre", nombre);
            crear.put("precio", precio);

            bd.insert("producto", null, crear);
            bd.close();
            etCodigo.setText("");
            etNombre.setText("");
            etPrecio.setText("");
            Toast.makeText(this, "Producto Creado", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Ingrese todos los campos, son obligatorios", Toast.LENGTH_LONG).show();
        }
    }
}