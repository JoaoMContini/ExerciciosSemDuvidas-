package com.mycompany.exercicio07;
public class Exercicio07 {

    public static void main(String[] args) {
        Sintoma s1 = new Sintoma("Dor de cabeça", "Dor na região da cabeça", 8, true);
        Sintoma s2 = new Sintoma("Tosse", "Tosse seca", 6, true);
        Sintoma s3 = new Sintoma("Febre", "Elevação da temperatura corporal", 7, true);
        Sintoma s4 = new Sintoma("Dor de garganta", "Dor na região da garganta", 5, true);
        Sintoma s5 = new Sintoma("Dor abdominal", "Dor na região do abdômen", 9, true);
        Sintoma s6 = new Sintoma("Diarreia", "Eliminação frequente de fezes líquidas", 7, true);

        Paciente p1 = new Paciente("João", 30, 'M', 1);
        p1.setSintoma(s1);

        Paciente p2 = new Paciente("Marcos", 49, 'M', 2);
        p2.setSintoma(s2);

        Paciente p3 = new Paciente("Mateus", 29, 'M', 3);
        p3.setSintoma(s3);

        Paciente p4 = new Paciente("Neide", 63, 'F', 4);
        p4.setSintoma(s4);

        Paciente p5 = new Paciente("Evillyn", 22, 'F', 5);
        p5.setSintoma(s5);

        Paciente p6 = new Paciente("Thalia", 22, 'F', 6);
        p6.setSintoma(s6);

    }
}
