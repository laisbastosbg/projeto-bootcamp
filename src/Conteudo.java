public abstract class Conteudo {
    private String titulo;
    private String descricao;
    public static final double XP_BASE = 10d;

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

// porque uma classe abstrata e não uma interface?
// Porque queremos que a classe tenha um comportamento padrão para o cálculo de XP, 
// mas ainda assim permita que as subclasses implementem suas próprias lógicas específicas.
// Além disso, uma classe abstrata pode ter atributos e métodos concretos, 
// enquanto uma interface só pode ter métodos abstratos (até Java 8, onde métodos default foram introduzidos).
// Isso permite que a classe Conteudo tenha um estado (atributos) e comportamento (métodos) compartilhados entre as subclasses.
