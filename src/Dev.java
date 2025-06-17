import java.util.ArrayList;

public class Dev {
    private String nome;
    private ArrayList<Conteudo> conteudosInscritos;
    private ArrayList<Conteudo> conteudosConcluidos;

    public Dev(String nome) {
        this.nome = nome;
        this.conteudosInscritos = new ArrayList<>();
        this.conteudosConcluidos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public ArrayList<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }
    
    public void inscreverEmBootcamp(Bootcamp bootcamp) {
        if (bootcamp != null) {
            for (Conteudo conteudo : bootcamp.getConteudos()) {
                if (!conteudosInscritos.contains(conteudo)) {
                    conteudosInscritos.add(conteudo);
                }
            }
        }
    }
}

//Qual a diferença entre um arquivo .java e um arquivo .class?
// Um arquivo .java é um arquivo de código-fonte Java, que contém o código escrito pelo programador. 
// Ele é legível por humanos e pode ser editado em qualquer editor de texto ou IDE.
// Um arquivo .class é o resultado da compilação do arquivo .java. 
// Ele contém o bytecode Java, que é o código intermediário que a JVM (Java Virtual Machine) executa. 
// O arquivo .class não é legível por humanos e é otimizado para execução rápida pela JVM.