import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("Descricao curso java");
        curso1.setCargaHoraria(8);

        Curso cursito = new Curso();
        cursito.setTitulo("curso java");
        cursito.setDescricao("Descricao curso java");
        cursito.setCargaHoraria(8);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de java");
        mentoria1.setDescricao("mentoria descricao");
        mentoria1.setData(LocalDate.now());
        
       /* System.out.println(curso1);
        System.out.println(cursito);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricap Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(cursito);
        bootcamp.getConteudos().add(mentoria1);

        Dev devJohana = new Dev();
        devJohana.setNome("Johana");
        devJohana.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos" + devJohana.getConteudosInscritos());
        devJohana.progredir();
        System.out.println("-------------");
        System.out.println("Conteudos inscritos" + devJohana.getConteudosInscritos());
        System.out.println("Conteudos concluidos johana" + devJohana.getConteudosConcluidos());
        System.out.println("XP:" + devJohana.calcularTotalXp());

        System.out.println("-------------");

        Dev devJose = new  Dev();
        devJose.setNome("Jose");
        devJose.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos" + devJose.getConteudosInscritos());
        devJose.progredir();
        System.out.println("-------------");
        System.out.println("Conteudos inscritos" + devJose.getConteudosInscritos());
        System.out.println("Conteudos concluidos jose" + devJose.getConteudosConcluidos());
        System.out.println("XP:" + devJose.calcularTotalXp());

        System.out.println("-------------");



    }
}
