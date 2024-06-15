package br.com.dio.desafio;

import br.com.dio.desafio.dominio.Curso;

import java.time.LocalDate;

/**
 * The type Main.
 */
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setCargaHoraria(8);
        curso1.setDescricao("descrição do curso");
        curso1.setTitulo("curso java");

        Curso curso2 = new Curso();

        curso2.setCargaHoraria(9);
        curso2.setDescricao("descrição do curso");
        curso2.setTitulo("curso kotlin");

        System.out.println(curso1);
        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição da mentoria");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);

    }
}