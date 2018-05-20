package Aplicación.Modelo.Dominio;

import java.util.ArrayList;

/**
 *
 * @author Marcos
 */
public class Palabras {
    
    private ArrayList<String> listaPalabras;

    public Palabras() {
        listaPalabras = new ArrayList();
    }

    public Palabras(ArrayList<String> listaPalabras) {
        this.listaPalabras = listaPalabras;
    }

    /**
     * @return the listaPalabras
     */
    public ArrayList<String> getListaPalabras() {
        return listaPalabras;
    }

    /**
     * @param listaPalabras the listaPalabras to set
     */
    public void setListaPalabras(ArrayList<String> listaPalabras) {
        this.listaPalabras = listaPalabras;
    }
    
}
