package ar.com.marete.clientebasesb.carrito.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/carrito")
public class ProductosController extends BaseController{

    @GetMapping("/misproductos")
    public ModelAndView list(Model model, @RequestParam(name = "q", required = false) String query) {
        super.isUserLogueado();
        super.agregarCSSExtra("test.css");
        super.agregarJsExtra("componentTest.js");
        super.cargarAssetsExtra();
        return new ModelAndView("app/producto/lista",modelo);
    }

}
