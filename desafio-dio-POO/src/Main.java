import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso();
        Curso cursoJavaScript = new Curso();

        cursoJava.setTitulo("Java");
        cursoJava.setDescricao("Descrição Curso Java");
        cursoJava.setCargaHoraria(8);

        cursoJavaScript.setTitulo("Curso JavaScript");
        cursoJavaScript.setDescricao("Descrição Curso JavaScript");
        cursoJavaScript.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(cursoJava);
//        System.out.println(cursoJavaScript);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoJavaScript);
        bootcamp.getConteudos().add(mentoria);

        Dev devWilliam = new Dev();
        devWilliam.setNome("William");
        devWilliam.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Incritos William\n" +devWilliam.getConteudosInscritos());

        devWilliam.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluidos William\n" +devWilliam.getConteudosConcluidos());
        System.out.println("Conteúdos Incritos\n" +devWilliam.getConteudosInscritos());
        System.out.println("XP: "+devWilliam.calcularTotalXp());

        System.out.println("------------------------");
        Dev devAmanda = new Dev();
        devAmanda.setNome("Amanda");
        devAmanda.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Incritos Amanda\n" +devAmanda.getConteudosInscritos());

        devAmanda.progredir();
        devAmanda.progredir();
        devAmanda.progredir();

        System.out.println("-");
        System.out.println("Conteúdos Concluidos\n" +devAmanda.getConteudosConcluidos());
        System.out.println("Conteúdos Incritos\n" +devAmanda.getConteudosInscritos());
        System.out.println("XP: "+devAmanda.calcularTotalXp());

    }
}