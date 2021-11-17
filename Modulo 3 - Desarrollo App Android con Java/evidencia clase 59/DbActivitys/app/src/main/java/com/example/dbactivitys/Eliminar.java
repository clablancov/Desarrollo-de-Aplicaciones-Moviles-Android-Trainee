package com.example.dbactivitys;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Eliminar extends AppCompatActivity {

    EditText etCodElimina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eliminar);

        etCodElimina = findViewById(R.id.etCodElimina);
    }

    public void eliminarProducto(View v){
        Admindb conex = new Admindb(this, "Productos", null, 1);
        SQLiteDatabase bd = conex.getWritableDatabase();

        String codigo = etCodElimina.getText().toString();

        if(!codigo.isEmpty()){
            bd.delete("producto","codigo="+codigo, null);
            bd.close();
            etCodElimina.setText("");
            Toast.makeText(this, "Producto Eliminado", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(this, "Debe ingresar un codigo de producto!!", Toast.LENGTH_LONG).show();
        }
    }
}