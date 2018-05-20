package Aplicación.Modelo.Datos;

import Aplicación.Modelo.Dominio.Libro;
import java.util.ArrayList;

/**
 *
 * @author Marcos
 */
public class ListadoLibro {
    
    private ArrayList<Libro> libros;

    public ListadoLibro() {
        libros = new ArrayList();
    }

    public ListadoLibro(ArrayList<Libro> libros) {
        this.libros = libros;
    }
    
    public void agregarLibros(Libro unLibro) {
        getLibros().add(unLibro);
    }

    /**
     * @return the libros
     */
    public ArrayList<Libro> getLibros() {
        return libros;
    }

    /**
     * @param libros the listaLibro to set
     */
    public void setListaLibro(ArrayList<Libro> libros) {
        this.libros = libros;
    }
    
}
