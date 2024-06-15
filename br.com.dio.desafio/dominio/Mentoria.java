package br.com.dio.desafio;

import java.time.LocalDate;


public class Mentoria extends Conteudo {

	LocalDate data;

	@Override
	public String toString() {
		return "Mentoria{" +
				"titulo='" + getTitulo() + '\'' +
				", descricao='" + getDescricao() + '\'' +
				", data=" + data +
				'}';
	}


	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public double calcularXp() {
		return XP_PADRAO + 20d;
	}

	@Override
	public String getTitulo() {
		return this.titulo;
	}

	@Override
	public String getDescricao() {
		return this.descricao;
	}

}