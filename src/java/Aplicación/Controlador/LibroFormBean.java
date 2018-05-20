package Aplicación.Controlador;

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

    Libro unLibro;
    
    
    public LibroFormBean() {
    }
    
}
