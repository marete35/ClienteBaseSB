package ar.com.marete.clientebasesb.carrito.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/carrito")
public class ProductosController {


    @GetMapping("/misproductos")
    public String list(Model model, @RequestParam(name = "q", required = false) String query) {
        return "app/producto/lista";
    }

}
