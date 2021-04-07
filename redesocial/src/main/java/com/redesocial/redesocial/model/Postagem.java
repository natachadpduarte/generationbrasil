package com.redesocial.redesocial.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity /*Criando Entidade*/
@Table(name = "Postagem") /*Essa entidade vai virar uma tabela e essa tabela se chamará post)*/
public class Postagem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) /*Transformando em Primary Key*/
	private long id;
	
	@NotNull /*definindo que o campo não poder ser nulo*/
	@Size(min = 5, max = 100) /*definindo quantidade caracters do titulo*/
	private String titulo;
	
	@Size(min = 10, max = 500)
	private String texto;
	
	@Temporal(TemporalType.TIMESTAMP) /*passando qual o tipo de tempo*/
	private Date data = new java.sql.Date(System.currentTimeMillis());
	
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Tema tema;
	
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Usuario usuario;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Tema getTema() {
		return tema;
	}
	public void setTema(Tema tema) {
		this.tema = tema;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	

	
	
}
