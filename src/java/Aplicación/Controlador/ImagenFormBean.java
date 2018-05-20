package Aplicación.Controlador;

import Aplicación.Modelo.Datos.ListadoImagen;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseId;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author Marcos
 */
@ManagedBean
@SessionScoped
public class ImagenFormBean implements Serializable {

    private transient UploadedFile file = null;
    private byte[] imagen;
    private byte[] nuevaImagen;
    private ListadoImagen listadoImagen;
    private String fecha;
    
    public ImagenFormBean() {
        listadoImagen = new ListadoImagen();
    }
    
    public void agregarImagen() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
        Date unaFecha = formatter.parse(getFecha());
        setImagen(file.getContents());
        getListadoImagen().llenarListado(unaFecha, imagen);
        FacesMessage message = new FacesMessage("Succesful", file.getFileName() + " is uploaded.");
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
    
    public StreamedContent getImagenSubida() throws IOException {
        FacesContext context = FacesContext.getCurrentInstance();
        if (context.getCurrentPhaseId() == PhaseId.RENDER_RESPONSE) {
            return new DefaultStreamedContent();
        }
        else {
            if (getImagen() == null) {
                return null;
            }
            else {
                return new DefaultStreamedContent(new ByteArrayInputStream(getImagen()),"img.png");
            }
        }
    }
    
    public StreamedContent getImagenSubidaListado() throws IOException {
        FacesContext context = FacesContext.getCurrentInstance();
        if (context.getCurrentPhaseId() == PhaseId.RENDER_RESPONSE) {
            return new DefaultStreamedContent();
        }
        else {
            String nuevaImg = context.getExternalContext().getRequestParameterMap().get("numI");
            int in = Integer.parseInt(nuevaImg);
            setNuevaImagen(getListadoImagen().getListaImagen().get(in).getImagen());
            if (getNuevaImagen() == null) {
                return null;
            }
            else {
                return new DefaultStreamedContent(new ByteArrayInputStream(getNuevaImagen()));
            }
        }
    }
   
    public void reiniciarImagen() {
        listadoImagen = new ListadoImagen();
    }

    /**
     * @return the file
     */
    public UploadedFile getFile() {
        return file;
    }

    /**
     * @param file the file to set
     */
    public void setFile(UploadedFile file) {
        this.file = file;
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

    /**
     * @return the nuevaImagen
     */
    public byte[] getNuevaImagen() {
        return nuevaImagen;
    }

    /**
     * @param nuevaImagen the nuevaImagen to set
     */
    public void setNuevaImagen(byte[] nuevaImagen) {
        this.nuevaImagen = nuevaImagen;
    }

    /**
     * @return the listadoImagen
     */
    public ListadoImagen getListadoImagen() {
        return listadoImagen;
    }

    /**
     * @param listadoImagen the listadoImagen to set
     */
    public void setListadoImagen(ListadoImagen listadoImagen) {
        this.listadoImagen = listadoImagen;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}
