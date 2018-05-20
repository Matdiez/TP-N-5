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
    private ListadoLibro listadoLibro2;
    private String isbn;
    private String autor;
    private String título;
    private String precio;
    private String buscador;
    
    public LibroFormBean() {
        listadoLibro = new ListadoLibro();
        listadoLibro2 = new ListadoLibro();
    }
    
    public void agregarLibro() {
        setUnLibro(new Libro(getIsbn(),getAutor(),getTítulo(),getPrecio()));
        getListadoLibro().agregarLibros(getUnLibro());
    }
    
    public void buscarLibro() {
        for (int i=0;i<getListadoLibro().getLibros().size();i++) {
            if (getListadoLibro().getLibros().get(i).getTítulo().equals(getBuscador())) {
                getListadoLibro2().getLibros().add(getListadoLibro().getLibros().get(i));
            }
        }
    }
    
    public void reiniciarLista() {
        listadoLibro = new ListadoLibro();
        listadoLibro2 = new ListadoLibro();
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

    /**
     * @return the listadoLibro2
     */
    public ListadoLibro getListadoLibro2() {
        return listadoLibro2;
    }

    /**
     * @param listadoLibro2 the listadoLibro2 to set
     */
    public void setListadoLibro2(ListadoLibro listadoLibro2) {
        this.listadoLibro2 = listadoLibro2;
    }

    /**
     * @return the buscador
     */
    public String getBuscador() {
        return buscador;
    }

    /**
     * @param buscador the buscador to set
     */
    public void setBuscador(String buscador) {
        this.buscador = buscador;
    }
    
}
