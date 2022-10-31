package ar.com.marete.clientebasesb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/personas")
public class PersonaController {


	@RequestMapping("/lista")
	public String mostrarPersonas() {
		return "personas/lista";
	}

}
