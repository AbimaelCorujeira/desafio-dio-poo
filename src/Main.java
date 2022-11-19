import dev.corujeira.abimael.dominio.*;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargahoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso SQL");
        curso2.setDescricao("Descrição curso SQL");
        curso2.setCargahoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da mentoria Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAbimael = new Dev();
        devAbimael.setNome("Abimael");
        devAbimael.inscreverBootcamp(bootcamp);
        System.out.println("\nConteúdos Inscritos Abimael: " + devAbimael.getConteudosInscritos());
        devAbimael.progredir();
        devAbimael.progredir();
        System.out.println("\nConteúdos Inscritos Abimael: " + devAbimael.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Abimael: " + devAbimael.getConteudosConcluidos());
        System.out.println("XP: " + devAbimael.calcularXp());

        Dev devMarcela = new Dev();
        devMarcela.setNome("Marcela");
        devMarcela.inscreverBootcamp(bootcamp);
        System.out.println("\nConteúdos Inscritos Marcela: " + devMarcela.getConteudosInscritos());
        devMarcela.progredir();
        devMarcela.progredir();
        devMarcela.progredir();
        System.out.println("\nConteúdos Inscritos Marcela: " + devMarcela.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Marcela: " + devAbimael.getConteudosConcluidos());
        System.out.println("XP: " + devMarcela.calcularXp());



    }
}