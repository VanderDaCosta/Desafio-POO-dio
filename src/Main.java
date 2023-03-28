import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Inicialização em java");
        curso1.setCargoHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de CSS");
        curso2.setDescricao("Introdução ao CSS");
        curso2.setCargoHoraria(6);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("ajudando você com o java");
        mentoria.setData(LocalDate.now());

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();

        BootCamp bootcamp =  new BootCamp();
        bootcamp.setNome("BootCamp Java Developer");
        bootcamp.setDescricao("BootCamp de estudos iniciais com Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devVander = new Dev();
        devVander.setNome("Vander");
        devVander.inscreverBootCamp(bootcamp);

        System.out.println("Conteudo inscritos Vander: " + devVander.getConteudosInscritos());

        devVander.progredir();
        devVander.progredir();
        System.out.println("=");
        System.out.println("Conteudo inscritos Vander: " + devVander.getConteudosInscritos());
        System.out.println("Conteudo concluidos Vander: " + devVander.getConteudosConcluidos());
        System.out.println("XP: " + devVander.calcularTotalXp());

        System.out.println("===========================");

        Dev devFernanda = new Dev();
        devFernanda.setNome("Fernanda");
        devFernanda.inscreverBootCamp(bootcamp);

        System.out.println("Conteudo inscritos Fernanda:" + devFernanda.getConteudosInscritos());

        devFernanda.progredir();
        devFernanda.progredir();
        devFernanda.progredir();
        System.out.println("=");
        System.out.println("Conteudo inscritos Fernanda:" + devFernanda.getConteudosInscritos());
        System.out.println("Conteudo concluidos Fernanda:" + devFernanda.getConteudosConcluidos());
        System.out.println("XP: " + devFernanda.calcularTotalXp());
        /*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
        */
    }
}