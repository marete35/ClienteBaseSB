package ar.com.marete.clientebasesb.carrito.controladores;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Scope("request")
@RequestMapping("/test")
public class EjemploController extends BaseController {

        @GetMapping("/ejemplomain")
        public ModelAndView list(@RequestParam(name = "q", required = false) String query) {
            if(super.isUserLogueado()) {
                //Cargo los css particulares para dicha página
                super.agregarCSSExtra("styles.css");
                //Cargo los js particulares para dicha página
                super.agregarJsExtra("componentTest.js");
                super.agregarJsExtra("componentTest1.js");
                super.cargarAssetsExtra();
                return new ModelAndView("carrito/pages/ejemplo/ejemploMain", modelo);
            }else{
                return new ModelAndView("app/login", modelo);
            }
        }

}


