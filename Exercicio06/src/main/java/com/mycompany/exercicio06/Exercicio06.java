/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio06;

/**
 *
 * @author joaoc
 */
public class Exercicio06 {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("João", 1);
        a1.setIdade(26);
        a1.setGenero('M');
        a1.setNota(8.5);

        Aluno a2 = new Aluno("Marcos", 2);
        a2.setIdade(49);
        a2.setGenero('M');
        a2.setNota(8.0);

        Aluno a3 = new Aluno("Mateus", 3);
        a3.setIdade(29);
        a3.setGenero('M');
        a3.setNota(9.5);

        Turma t1 = new Turma("Turma 1", 1);
        t1.setAluno(a1);

        Turma t2 = new Turma("Turma 2", 2);
        t2.setAluno(a2);

        if (t1.getAluno() == null) {
            System.out.println("Aluno não cadastrado");
        } else {
            System.out.println("Aluno " + t1.getAluno().getNome() + " cadastrado na Turma 1");
        }

        if (t2.getAluno() == null) {
            System.out.println("Aluno não cadastrado");
        } else {
            System.out.println("Aluno " + t2.getAluno().getNome() + " cadastrado na Turma 2");
        }
    }
    }

