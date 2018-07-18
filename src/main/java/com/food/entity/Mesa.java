package com.food.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


	@Entity
	@Table(name="TP_MESA")
	public class Mesa implements Serializable{

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int codmesa;

		private int nromesa;
		private String nombremesa;

		private int estmesa;
		
		public int getCodmesa() {
			return codmesa;
		}
		public void setCodmesa(int codmesa) {
			this.codmesa = codmesa;
		}
		public int getNromesa() {
			return nromesa;
		}
		public void setNromesa(int nromesa) {
			this.nromesa = nromesa;
		}
		
		public String getNombremesa() {
			return nombremesa;
		}
		public void setNombremesa(String nombremesa) {
			this.nombremesa = nombremesa;
		}
		public int getEstmesa() {
			return estmesa;
		}
		public void setEstmesa(int estmesa) {
			this.estmesa = estmesa;
		}
		
		
    }
