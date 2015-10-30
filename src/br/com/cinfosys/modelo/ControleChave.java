package br.com.cinfosys.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.internal.NotNull;

import java.util.Calendar;

@Entity
public class ControleChave {
	@Id
	private int carteirinha;
	@Column
	private String nome;
	@Column
	private int salaLab;
	@Column
	@NotNull
	@DateTimeFormat(pattern="dd/mm/yyyy")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar retirada;
	@Column
	private boolean finalizado;
	
	public int getCarteirinha() {
		return carteirinha;
	}
	public void setCarteirinha(int carteirinha) {
		this.carteirinha = carteirinha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getSalaLab() {
		return salaLab;
	}
	public void setSalaLab(int salaLab) {
		this.salaLab = salaLab;
	}
	public Calendar getRetirada() {
		return retirada;
	}
	public void setRetirada(Calendar retirada) {
		this.retirada = retirada;
	}
	public boolean isFinalizado() {
		return finalizado;
	}
	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}
}
