package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import service.ServicePacote;

@Controller
@RequestMapping(path = "/pacote")
public class PacoteControler {
	
	@Autowired
	private ServicePacote servicePacote;

}
