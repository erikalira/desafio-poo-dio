import com.dio.dominio.Bootcamp;
import com.dio.dominio.Curso;
import com.dio.dominio.Dev;
import com.dio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Learn Java OOP");
        curso1.setCargaHoraria(20);

        Curso curso2 = new Curso();
        curso2.setTitulo("JavaScript");
        curso2.setDescricao("Learn JavaScript OOP");
        curso2.setCargaHoraria(20);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria Java");
        mentoria.setDescricao("mentoria Java OOP");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        System.out.println("- - - - - - - ");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setTitulo("Bootcamp Java Dev");
        bootcamp.setDescricao("Descricao Bootcamp Java Dev");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Erika");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos " + dev1.getNome() + ": " + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("-> progresso ->");
        dev1.progredir();
        System.out.println("-> progresso ->");
        System.out.println("Conteudos Inscritos " + dev1.getNome() + ": " + dev1.getConteudosInscritos());
        System.out.println("Conteudos Concluidos " + dev1.getNome() + ": " + dev1.getConteudosConcluidos());
        System.out.println("XP:" + dev1.calcularTotalXp());

        System.out.println("- - - - - - - ");

        Dev dev2 = new Dev();
        dev2.setNome("João");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos " + dev2.getNome() + ": " + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("-> progresso ->");
        System.out.println("Conteudos Inscritos " + dev2.getNome() + ": " + dev1.getConteudosInscritos());
        System.out.println("Conteudos Concluidos " + dev2.getNome() + ": " + dev2.getConteudosConcluidos());
        System.out.println("XP:" + dev2.calcularTotalXp());
    }
}
