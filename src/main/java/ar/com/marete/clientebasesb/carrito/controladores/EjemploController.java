package ar.com.marete.clientebasesb.carrito.controladores;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class EjemploController extends BaseController {

        @GetMapping("/ejemplo2")
        public ModelAndView list(@RequestParam(name = "q", required = false) String query) {
            if(super.isUserLogueado()) {
                super.agregarCSSExtra("test.css");
                super.agregarJsExtra("componentTest.js");
                super.cargarAssetsExtra();
                return new ModelAndView("carrito/pages/ejemplo2", modelo);
            }else{
                return new ModelAndView("app/login", modelo);
            }
        }

}


