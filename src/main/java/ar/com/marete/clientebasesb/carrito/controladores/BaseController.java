package ar.com.marete.clientebasesb.carrito.controladores;

import ar.com.marete.clientebasesb.config.EnvProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@Controller
public class BaseController {

    private ArrayList<String> archivosJs = new ArrayList<>();
    private ArrayList<String> archivosCss = new ArrayList<>();
    protected Map<String, Object> modelo = new HashMap<String, Object>();

    @Autowired
    private EnvProperties envProperties;

    /**
     * Agrega al head de la vista actual un include a la hoja .css pasada por parametro.
     */
    protected void agregarCSSExtra(String archivo){
        if(!this.archivosCss.contains(archivo)){
            archivo += "?="+ Calendar.getInstance().getTimeInMillis();
            this.archivosCss.add(archivo);
        }
    }

    /**
     * Agrega al head de la vista actual un include al archivo .js pasado como parametro
     * @param archivo
     */
    protected void agregarJsExtra(String archivo){
        if(!this.archivosJs.contains(archivo)){
            archivo += "?v="+Calendar.getInstance().getTimeInMillis();
            this.archivosJs.add(archivo);
        }
    }

    /**
     * Metodo para cargar los Assets particulares de cada pagina.
     */
    protected void cargarAssetsExtra(){
        this.modelo.put("adicionalCSS",this.archivosCss);
        this.modelo.put("adicionalJs",this.archivosJs);
    }

    protected boolean isUserLogueado(){
        return true;
    }
}
