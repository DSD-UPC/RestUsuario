package com.food.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.food.entity.Usuario;
import com.food.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@GetMapping("findAll")
	public List<Usuario> obtenerUsuarios(){
		
		return (List<Usuario>) usuarioRepository.findAll();
		
	}
	
	@PostMapping("/login")
	public Usuario Login(@Valid @RequestBody Usuario usuario) {
		
		//Valida codigo de usuario
		if (usuarioRepository.findByCodusuario(usuario.getCodusuario()).isEmpty()==true) {
			
			Usuario usuario_ = new Usuario();
	    	usuario_.setCodusuario("");
	    	usuario_.setNomusuario("Usuario no existe");
	    	return usuario_;
			
		}
		else {
			
			String password;
			
			password = usuarioRepository.findByCodusuario(usuario.getCodusuario()).get(0).getPassword();
			
			if(password.trim().equals(usuario.getPassword().trim())) {
		    	return usuarioRepository.findByCodusuario(usuario.getCodusuario()).get(0);
			} else {
				
				Usuario newUsuario = new Usuario();
				newUsuario.setCodusuario("");
				newUsuario.setNomusuario("Password incorrecto");
				return newUsuario;
			}
			
		}
		
		
	}
	
	@PostMapping("/registrar")
	public Usuario registrarUsuario(@Valid @RequestBody Usuario usuario) {
		
		return usuarioRepository.save(usuario);
		
	}
	
	
	
	
}
