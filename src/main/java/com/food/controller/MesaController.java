package com.food.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.food.entity.Mesa;
import com.food.entity.Usuario;
import com.food.repository.MesaRepository;

@RestController
@RequestMapping("/mesa")
public class MesaController {
	@Autowired
	private MesaRepository mesaRepository;
	
	@GetMapping("findAll")
	public List<Mesa> obtenerMesas(){
		
		return (List<Mesa>) mesaRepository.findAll();
		
	}
	
	
	@PostMapping("/registrar")
	public Mesa registrarMesa(@Valid @RequestBody Mesa mesa) {
		
		return mesaRepository.save(mesa);
		
	}
	
}
