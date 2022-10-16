package ar.com.marete.clientebasesb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/personas")
public class PersonaController {


	@RequestMapping("/lista")
	public String mostrarPersonas() {
		return "personas/lista";
	}

}
