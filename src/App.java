import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev("Alice");
        dev1.inscreverEmBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos:\n" + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteúdos Inscritos após progresso:" + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos:" + dev1.getConteudosConcluidos());
        System.out.println("XP Total: " + dev1.calcularTotalXp());

        Dev dev2 = new Dev("Bob");
        dev2.inscreverEmBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos:" + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteúdos Inscritos após progresso:" + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos:" + dev2.getConteudosConcluidos());
        System.out.println("XP Total: " + dev2.calcularTotalXp());
    }
}
