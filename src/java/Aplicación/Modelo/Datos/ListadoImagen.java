package Aplicación.Modelo.Datos;

import Aplicación.Modelo.Dominio.Imagen;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Marcos
 */
public class ListadoImagen implements Serializable {
    
    private int numI;
    private Date fecha;
    private byte[] imgagen;
    private ArrayList<Imagen> listaImagen;

    public ListadoImagen() {
        listaImagen = new ArrayList();
    }

    public void llenarListado(Date fecha, byte[] imgGuardar) {
        if (getListaImagen().isEmpty()) {
            setNumI(0);
        }
        else {
            setNumI(getListaImagen().size());
        }
        getListaImagen().add(new Imagen(getNumI(), fecha, imgGuardar));
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
     * @return the imgagen
     */
    public byte[] getImgagen() {
        return imgagen;
    }

    /**
     * @param imgagen the imgagen to set
     */
    public void setImgagen(byte[] imgagen) {
        this.imgagen = imgagen;
    }

    /**
     * @return the listaImagen
     */
    public ArrayList<Imagen> getListaImagen() {
        return listaImagen;
    }

    /**
     * @param listaImagen the listaImagen to set
     */
    public void setListaImagen(ArrayList<Imagen> listaImagen) {
        this.listaImagen = listaImagen;
    }

}