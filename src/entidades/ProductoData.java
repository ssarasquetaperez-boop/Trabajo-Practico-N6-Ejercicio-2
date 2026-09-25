package entidades;

import java.util.ArrayList;

public class ProductoData {

    private static final ArrayList<Producto> lista = new ArrayList<>();

    public void guardarProducto(Producto p) {
        p.setIdProducto(lista.size() + 1);
        lista.add(p);
    }

    public void borrarProducto(Producto p) {
        lista.remove(p);
    }

    public ArrayList<Producto> obtenerProducto() {
        return lista;
    }

    public void modificarProductor(Producto nuevoProducto) {

        for (Producto e : lista) {
            if (e.getIdProducto() == nuevoProducto.getIdProducto()) {
                e.setCodigo(nuevoProducto.getCodigo());
                e.setDescripcion(nuevoProducto.getDescripcion());
                e.setCategoria(nuevoProducto.getCategoria());
                e.setPrecio(nuevoProducto.getPrecio());
                e.setStock(nuevoProducto.getStock());
            }
        }
    }

}
