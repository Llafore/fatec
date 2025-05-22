package com.example.pizzaria;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

	@Entity
	@Table(name="menu")
	
public class Menu {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		private String nome;
		private double valor;
		private String descritivo;
		
		@ManyToOne
		@JsonIgnoreProperties ("menu")
		private Estoque ingredientes;
		
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public double getValor() {
			return valor;
		}
		public void setValor(double valor) {
			this.valor = valor;
		}
		public String getDescritivo() {
			return descritivo;
		}
		public void setDescritivo(String descritivo) {
			this.descritivo = descritivo;
		}
		public Estoque getIngredientes() {
			return ingredientes;
		}
		public void setIngredientes(Estoque ingredientes) {
			this.ingredientes = ingredientes;
		}
}
