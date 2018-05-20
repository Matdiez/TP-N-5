package Aplicación.Modelo.Dominio;

/**
 *
 * @author Marcos
 */
public class Libro {
    
    private String isbn;
    private String título;
    private String autor;
    private String precio;

    public Libro() {
    }

    public Libro(String isbn, String título, String autor, String precio) {
        this.isbn = isbn;
        this.título = título;
        this.autor = autor;
        this.precio = precio;
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
