package br.com.dio.desafio;

import java.util.LinkedHashSet;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

	public String nome;

	private Bootcamp bootcamp;
	private Set<Conteudo> conteudoInscrito = new LinkedHashSet<>();
	private Set<Conteudo> conteudoConcluido = new LinkedHashSet<>();

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Dev dev = (Dev) o;
		return Objects.equals(nome, dev.nome) && Objects.equals(bootcamp, dev.bootcamp) && Objects.equals(conteudoInscrito, dev.conteudoInscrito) && Objects.equals(conteudoConcluido, dev.conteudoConcluido);
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, bootcamp, conteudoInscrito, conteudoConcluido);
	}

	public void inscreverBootcamp(Bootcamp bootcamp) {
		this.conteudoInscrito.addAll(bootcamp.getConteudos());
		bootcamp.getDevsInscritos().add(this);
	}

	public void progredir() {
		Optional<Conteudo> conteudo = this.conteudoInscrito.stream().findFirst();
		/*Conteudo conteudo = this.conteudoInscrito.iterator().next();
		this.conteudoConcluido.add(conteudo);
		this.conteudoInscrito.remove(conteudo);
		*/

		if (conteudo.isPresent()) {
			this.conteudoConcluido.add(conteudo.get());
			this.conteudoInscrito.remove(conteudo.get());
		} else {
			System.out.println("Você não esta matriculado em nenhum conteudo");
		}
	}

	public double calcularTotalXp() {
		return this.conteudoConcluido
				.stream()
				.mapToDouble(Conteudo -> Conteudo.calcularXp())
				.sum();
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConteudoInscrito() {
		return conteudoInscrito;
	}

	public void setConteudoInscrito(Set<Conteudo> conteudoInscrito) {
		this.conteudoInscrito = conteudoInscrito;
	}

	public Set<Conteudo> getConteudoConcluido() {
		return conteudoConcluido;
	}

	public void setConteudoConcluido(Set<Conteudo> conteudoConcluido) {
		this.conteudoConcluido = conteudoConcluido;
	}

	@Override
	public String toString() {
		return "Dev{" +
				"nome='" + nome + '\'' +
				", conteudoInscrito=" + conteudoInscrito +
				", conteudoConcluido=" + conteudoConcluido +
				'}';
	}


}
