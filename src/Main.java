import java.time.LocalDate;

import desafio.dominio.Bootcamp;
import desafio.dominio.Curso;
import desafio.dominio.Dev;
import desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Curso voltado aos iniciantes em java");
        curso1.setCargaHoraria(120);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JS");
        curso2.setDescricao("Curso voltado aos iniciantes em JS");
        curso2.setCargaHoraria(60);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descrição da mentoria de java");
        mentoria.setData(LocalDate.now());

        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devAndre = new Dev();
        devAndre.setNome("André");
        devAndre.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de André: "+devAndre.getConteudisInscritos());
        devAndre.progredir();
        devAndre.progredir();
        System.out.print("--");
        System.out.println("Conteúdos inscritos de André(atualizado): "+devAndre.getConteudisInscritos());
        System.out.println("Conteúdos concluídos por André: "+devAndre.getConteudosConcluidos());
        System.out.println("XP: "+devAndre.calcularTotalXP());

        System.out.println("---------------------------");

        Dev devJoao = new Dev();
        devAndre.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de João: "+devJoao.getConteudisInscritos());
        devJoao.progredir();
        System.out.print("--");
        System.out.println("Conteúdos inscritos de João(atualizado): "+devJoao.getConteudisInscritos());
        System.out.println("Conteúdos concluídos por João: "+devJoao.getConteudosConcluidos());
        System.out.println("XP: "+devJoao.calcularTotalXP());

    }
}
