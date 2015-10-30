package br.com.cinfosys.modelo;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.internal.NotNull;

@Entity
public class ControleEstoque {
	@Id
	@GeneratedValue
	private int id;
	@Column
	private String nome;
	@Column
	private String descricao;
	@Column
	@Temporal(TemporalType.DATE)
	private Calendar chegada;
	@Column
	@NotNull
	@DateTimeFormat(pattern="dd/mm/yyyy")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar retirada;
	@Column
	private String destino;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Calendar getChegada() {
		return chegada;
	}
	public void setChegada(Calendar chegada) {
		this.chegada = chegada;
	}
	public Calendar getRetirada() {
		return retirada;
	}
	public void setRetirada(Calendar retirada) {
		this.retirada = retirada;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
}
