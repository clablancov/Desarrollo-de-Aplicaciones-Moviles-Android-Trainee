package com.example.dbactivitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Modificar extends AppCompatActivity {

    EditText etCodigo, etNombre, etPrecio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modificar);

        etCodigo = findViewById(R.id.codigoProducto);
        etNombre = findViewById(R.id.nombreProducto);
        etPrecio = findViewById(R.id.precioProducto);
    }

    public void buscarProducto(View v){
        Admindb conex = new Admindb(this, "Productos", null, 1);
        SQLiteDatabase bd = conex.getWritableDatabase();

        String codigo = etCodigo.getText().toString();

        if(!codigo.isEmpty()){
            Cursor fila = bd.rawQuery("select nombre, precio from producto where codigo="+codigo, null);

            if (fila.moveToFirst()){
                etNombre.setText(fila.getString(0));
                etPrecio.setText(fila.getString(1));
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

    public void actualizarProducto(View v){
        Admindb conex = new Admindb(this, "Productos", null, 1);
        SQLiteDatabase bd = conex.getWritableDatabase();

        String codigo = etCodigo.getText().toString();
        String nombre = etNombre.getText().toString();
        String precio = etPrecio.getText().toString();

        if(!codigo.isEmpty() && !nombre.isEmpty() && !precio.isEmpty()){
            ContentValues actualizar = new ContentValues();
            actualizar.put("codigo", codigo);
            actualizar.put("nombre", nombre);
            actualizar.put("precio", precio);

            bd.update("producto", actualizar, "codigo="+codigo, null);
            bd.close();
            etCodigo.setText("");
            etNombre.setText("");
            etPrecio.setText("");
            Toast.makeText(this, "Producto Actualizado", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(this, "Ingrese todos los campos, son obligatorios", Toast.LENGTH_LONG).show();
        }
    }
}