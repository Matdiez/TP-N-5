package Aplicación.Modelo.Dominio;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Marcos
 */
public class Imagen implements Serializable {
    
    private int numI;
    private Date fecha;
    private byte[] imagen;

    public Imagen() {
    }

    public Imagen(int numI, Date fecha, byte[] imagen) {
        this.numI = numI;
        this.fecha = fecha;
        this.imagen = imagen;
    }

    /**
     * @return the numI
     */
    public int getNumI() {
        return numI;
    }

    /**
     * @param numI the numI to set
     */
    public void setNumI(int numI) {
        this.numI = numI;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the imagen
     */
    public byte[] getImagen() {
        return imagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }
    
}
