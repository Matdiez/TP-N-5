package Aplicación.Controlador;

import Aplicación.Modelo.Datos.ListadoLibro;
import Aplicación.Modelo.Dominio.Libro;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Marcos
 */
@ManagedBean
@ViewScoped
public class LibroFormBean {

    private Libro unLibro;
    private ListadoLibro listadoLibro;
    private String isbn;
    private String autor;
    private String título;
    private String precio;
    
    public LibroFormBean() {
        listadoLibro = new ListadoLibro();
    }

    /**
     * @return the unLibro
     */
    public Libro getUnLibro() {
        return unLibro;
    }

    /**
     * @param unLibro the unLibro to set
     */
    public void setUnLibro(Libro unLibro) {
        this.unLibro = unLibro;
    }

    /**
     * @return the listadoLibro
     */
    public ListadoLibro getListadoLibro() {
        return listadoLibro;
    }

    /**
     * @param listadoLibro the listadoLibro to set
     */
    public void setListadoLibro(ListadoLibro listadoLibro) {
        this.listadoLibro = listadoLibro;
    }

    /**
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the título
     */
    public String getTítulo() {
        return título;
    }

    /**
     * @param título the título to set
     */
    public void setTítulo(String título) {
        this.título = título;
    }

    /**
     * @return the precio
     */
    public String getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
}
