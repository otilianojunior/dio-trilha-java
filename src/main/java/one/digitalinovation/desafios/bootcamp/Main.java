package one.digitalinovation.desafios.bootcamp;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java Developer");
        bootcamp.setDescricao("Descrição Bootcamp java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos " + devCamila.getNome() + " " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos " + devCamila.getNome() + " " + devCamila.getConteudosInscritos());
        System.out.println("-");
        System.out.println("Conteúdos concluídos " + devCamila.getNome() + " " + devCamila.getConteudosConcluidos());
        System.out.println("XP Total: " + devCamila.calcularTotalXp());

        System.out.println(" ------ ------ ------ ------ ----- -----");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos " + devJoao.getNome() + " " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos " + devJoao.getNome() + " " + devJoao.getConteudosInscritos());
        System.out.println("-");
        System.out.println("Conteúdos concluídos " + devJoao.getNome() + " " + devJoao.getConteudosConcluidos());
        System.out.println("XP Total: " + devJoao.calcularTotalXp());


    }
}
