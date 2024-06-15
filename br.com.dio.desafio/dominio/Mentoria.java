package br.com.dio.desafio;

import java.time.LocalDate;

/**
 * The type Mentoria.
 */
public class Mentoria {
	/**
	 * The Titulo.
	 */
	String titulo;
	/**
	 * The Descricao.
	 */
	String descricao;
	/**
	 * The Data.
	 */
	LocalDate data;

	@Override
	public String toString() {
		return "Mentoria{" +
				"titulo='" + titulo + '\'' +
				", descricao='" + descricao + '\'' +
				", data=" + data +
				'}';
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}
}