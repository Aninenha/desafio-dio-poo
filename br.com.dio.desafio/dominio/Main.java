package br.com.dio.desafio;

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

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição da mentoria");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("Ana");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: " + dev.getConteudoInscrito());
        dev.progredir();
        dev.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos: " + dev.getConteudoInscrito());
        System.out.println("Conteúdos Concluídos: " + dev.getConteudoConcluido());
        System.out.println("XP: " + dev.calcularTotalXp());

        System.out.println("--------");

        Dev dev1 = new Dev();
        dev1.setNome("Joao");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: " + dev1.getConteudoInscrito());
        dev1.progredir();
        dev1.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos: " + dev1.getConteudoInscrito());
        System.out.println("Conteúdos Concluídos: " + dev1.getConteudoConcluido());
        System.out.println("XP: " + dev1.calcularTotalXp());
    }
}