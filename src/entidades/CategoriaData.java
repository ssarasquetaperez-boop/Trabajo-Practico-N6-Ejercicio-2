package entidades;

import java.util.ArrayList;

public class CategoriaData {

    public ArrayList<Categoria> obtenerCategoria() {

        ArrayList<Categoria> lista = new ArrayList<>();
        lista.add(new Categoria(1, "Pefumeria"));
        lista.add(new Categoria(2, "Alimentos"));
        lista.add(new Categoria(3, "Electronica"));
        lista.add(new Categoria(4, "Ropa"));

        return lista;
    }

}
