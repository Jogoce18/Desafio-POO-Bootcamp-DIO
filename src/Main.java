import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

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
        
        System.out.println(curso1);
        System.out.println(cursito);
        System.out.println(mentoria1);
    }
}
