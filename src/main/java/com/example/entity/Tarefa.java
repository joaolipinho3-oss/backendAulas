package com.example.entity;

import java.time.LocalDate;
import java.util.Objects;

import org.springframework.format.annotation.DateTimeFormat;

public class Tarefa {
	private String nome;
	private long id;
	@DateTimeFormat(iso=DateTimeFormat.ISO.DATE)
	private LocalDate dataEntrega;
	private String responsavel;
	
	//Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public LocalDate getDataEntrega() {
		return dataEntrega;
	}
	public void setDataEntrega(LocalDate dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	@Override
	public int hashCode() {
		return Objects.hash(dataEntrega, Long.valueOf(id), nome, responsavel);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarefa other = (Tarefa) obj;
		return Objects.equals(dataEntrega, other.dataEntrega) && id == other.id && Objects.equals(nome, other.nome)
				&& Objects.equals(responsavel, other.responsavel);
	}
	
	
}
