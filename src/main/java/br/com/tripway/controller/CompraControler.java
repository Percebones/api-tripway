package br.com.tripway.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.tripway.service.ServiceCompra;

@Controller
@RequestMapping(path = "/compra")
public class CompraControler {
	
	@Autowired
	private ServiceCompra serviceCompra;

}
