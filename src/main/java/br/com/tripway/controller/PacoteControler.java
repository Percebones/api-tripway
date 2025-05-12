package br.com.tripway.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.tripway.service.ServicePacote;

@Controller
@RequestMapping(path = "/pacote")
public class PacoteControler {
	
	@Autowired
	private ServicePacote servicePacote;

}
