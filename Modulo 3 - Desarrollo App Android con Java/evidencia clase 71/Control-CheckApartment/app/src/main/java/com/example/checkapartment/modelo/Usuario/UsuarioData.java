package com.example.checkapartment.modelo.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioData {

    public static ArrayList<Usuario> usuarioList() {
        ArrayList<Usuario> usuarioList = new ArrayList<>();

        Usuario usuario1 = new Usuario("cla.blancov@gmail.com", "123pass");
        Usuario usuario2 = new Usuario("demo@demo.cl", "123pass");

        usuarioList.add(usuario1);
        usuarioList.add(usuario2);

        return usuarioList;
    }
}
