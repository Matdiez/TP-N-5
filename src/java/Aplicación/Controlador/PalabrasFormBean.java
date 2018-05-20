package Aplicación.Controlador;

import Aplicación.Modelo.Dominio.Palabras;
import java.util.Collections;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Marcos
 */
@ManagedBean
@ViewScoped
public class PalabrasFormBean {
    
    private Palabras listadoPalabras;
    private String palabra;
    
    public PalabrasFormBean() {
        listadoPalabras = new Palabras();
    }

    public void agregarPalabras() {
        getListadoPalabras().getListaPalabras().add(getPalabra());
    }
    
    public void ordenarPalabras(){
        Collections.sort(getListadoPalabras().getListaPalabras());
    }
    
    public void reiniciarLista() {
        listadoPalabras = new Palabras();
    }
    
    /**
     * @return the listadoPalabras
     */
    public Palabras getListadoPalabras() {
        return listadoPalabras;
    }

    /**
     * @param listadoPalabras the listadoPalabras to set
     */
    public void setListadoPalabras(Palabras listadoPalabras) {
        this.listadoPalabras = listadoPalabras;
    }

    /**
     * @return the palabra
     */
    public String getPalabra() {
        return palabra;
    }

    /**
     * @param palabra the palabra to set
     */
    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
    
}
