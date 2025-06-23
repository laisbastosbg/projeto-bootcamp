import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Optional;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public Dev(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }
    
    public void inscreverEmBootcamp(Bootcamp bootcamp) {
        if (bootcamp != null) {
            for (Conteudo conteudo : bootcamp.getConteudos()) {
                if (!conteudosInscritos.contains(conteudo)) {
                    conteudosInscritos.add(conteudo);
                }
            }
            
            if (!bootcamp.getDevsInscritos().contains(this)) {
                bootcamp.getDevsInscritos().add(this);
            }
        }
    }

    public void progredir() {
        Optional<Conteudo> conteudo = conteudosInscritos.stream().findFirst();
        if (conteudo.isPresent()) {
            conteudosConcluidos.add(conteudo.get());
            conteudosInscritos.remove(conteudo.get());
        } else {
            System.out.println("Você não está inscrito em nenhum conteúdo.");
        }
    }

    public double calcularTotalXp() {
        double totalXp = 0;
        for (Conteudo conteudo : conteudosConcluidos) {
            totalXp += conteudo.calcularXp();
        }
        return totalXp;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }
}

//Qual a diferença entre um arquivo .java e um arquivo .class?
// Um arquivo .java é um arquivo de código-fonte Java, que contém o código escrito pelo programador. 
// Ele é legível por humanos e pode ser editado em qualquer editor de texto ou IDE.
// Um arquivo .class é o resultado da compilação do arquivo .java. 
// Ele contém o bytecode Java, que é o código intermediário que a JVM (Java Virtual Machine) executa. 
// O arquivo .class não é legível por humanos e é otimizado para execução rápida pela JVM.