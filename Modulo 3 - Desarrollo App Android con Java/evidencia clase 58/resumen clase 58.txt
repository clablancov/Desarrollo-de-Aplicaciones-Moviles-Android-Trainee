package com.example.conexdb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText codigoProducto, nombreProducto, precioProducto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        codigoProducto = findViewById(R.id.codigoProducto);
        nombreProducto = findViewById(R.id.nombreProducto);
        precioProducto = findViewById(R.id.precioProducto);
    }

    public void crearProducto(View v){

        Admindb conex = new Admindb(this, "Productos", null, 1);
        SQLiteDatabase bd = conex.getWritableDatabase();

        String codigo = codigoProducto.getText().toString();
        String nombre = nombreProducto.getText().toString();
        String precio = precioProducto.getText().toString();

        if(!codigo.isEmpty() && !nombre.isEmpty() && !precio.isEmpty()){
            ContentValues crear = new ContentValues();
            crear.put("codigo", codigo);
            crear.put("nombre", nombre);
            crear.put("precio", precio);

            bd.insert("producto", null, crear);
            bd.close();
            codigoProducto.setText("");
            nombreProducto.setText("");
            precioProducto.setText("");
            Toast.makeText(this, "Producto Creado", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(this, "Ingrese todos los campos, son obligatorios", Toast.LENGTH_LONG).show();
        }
    }

    public void actualizarProducto(View v){
        Admindb conex = new Admindb(this, "Productos", null, 1);
        SQLiteDatabase bd = conex.getWritableDatabase();

        String codigo = codigoProducto.getText().toString();
        String nombre = nombreProducto.getText().toString();
        String precio = precioProducto.getText().toString();

        if(!codigo.isEmpty() && !nombre.isEmpty() && !precio.isEmpty()){
            ContentValues actualizar = new ContentValues();
            actualizar.put("codigo", codigo);
            actualizar.put("nombre", nombre);
            actualizar.put("precio", precio);

            bd.update("producto", actualizar, "codigo="+codigo, null);
            bd.close();
            codigoProducto.setText("");
            nombreProducto.setText("");
            precioProducto.setText("");
            Toast.makeText(this, "Producto Actualizado", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(this, "Ingrese todos los campos, son obligatorios", Toast.LENGTH_LONG).show();
        }
    }

    public void buscarProducto(View v){
        Admindb conex = new Admindb(this, "Productos", null, 1);
        SQLiteDatabase bd = conex.getWritableDatabase();

        String codigo = codigoProducto.getText().toString();

        if(!codigo.isEmpty()){
            Cursor fila = bd.rawQuery("select nombre, precio from producto where codigo="+codigo, null);

            if (fila.moveToFirst()){
                nombreProducto.setText(fila.getString(0));
                precioProducto.setText(fila.getString(1));
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

    public void eliminarProducto(View v){
        Admindb conex = new Admindb(this, "Productos", null, 1);
        SQLiteDatabase bd = conex.getWritableDatabase();

        String codigo = codigoProducto.getText().toString();

        if(!codigo.isEmpty()){
            bd.delete("producto","codigo="+codigo, null);
            bd.close();
            codigoProducto.setText("");
            Toast.makeText(this, "Producto Eliminado", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(this, "Debe ingresar un codigo de producto!!", Toast.LENGTH_LONG).show();
        }
    }
}