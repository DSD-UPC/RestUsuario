package com.food.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TP_USUARIO")
public class Usuario{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idusuario;
	private String codusuario;
	private String password;
	private String nomusuario;
	private int codperfil;
	private int estusuario;	
	
	public int getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}
	
	public String getCodusuario() {
		return codusuario;
	}
	public void setCodusuario(String codusuario) {
		this.codusuario = codusuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNomusuario() {
		return nomusuario;
	}
	public void setNomusuario(String nomusuario) {
		this.nomusuario = nomusuario;
	}
	public int getCodperfil() {
		return codperfil;
	}
	public void setCodperfil(int codperfil) {
		this.codperfil = codperfil;
	}
	public int getEstusuario() {
		return estusuario;
	}
	public void setEstusuario(int estusuario) {
		this.estusuario = estusuario;
	}
	
	
}
