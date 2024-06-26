package br.com.dio.desafio;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;
import java.util.LinkedHashSet;

public class Bootcamp {
	private String nome;
	private String descricao;
	private LocalDate dataInicial = LocalDate.now();
	private LocalDate datafinal = LocalDate.now().plusDays(45);
	private Set<Dev> devsInscritos = new LinkedHashSet<>();
	private Set<Conteudo> conteudos = new LinkedHashSet<>();


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

	public LocalDate getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(LocalDate dataInicial) {
		this.dataInicial = dataInicial;
	}

	public LocalDate getDatafinal() {
		return datafinal;
	}

	public void setDatafinal(LocalDate datafinal) {
		this.datafinal = datafinal;
	}

	public Set<Dev> getDevsInscritos() {
		return devsInscritos;
	}

	public void setDevsInscritos(Set<Dev> devsInscritos) {
		this.devsInscritos = devsInscritos;
	}

	public Set<Conteudo> getConteudos() {
		return conteudos;
	}

	public void setConteudos(Set<Conteudo> conteudos) {
		this.conteudos = conteudos;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Bootcamp bootcamp = (Bootcamp) o;
		return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(datafinal, bootcamp.datafinal) && Objects.equals(devsInscritos, bootcamp.devsInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, descricao, dataInicial, datafinal, devsInscritos, conteudos);
	}
}
