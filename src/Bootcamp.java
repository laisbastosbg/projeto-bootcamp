import java.util.Date;

public class Bootcamp {
    private String nome;
    private String descricao;
    private Date dataInicio;
    private Date dataFinal;
    private Conteudo[] conteudos;
    private Dev[] devsInscritos;

    public Bootcamp(String nome, String descricao, Date dataInicio, Date dataFinal) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
        this.conteudos = new Conteudo[0];
        this.devsInscritos = new Dev[0];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public Conteudo[] getConteudos() {
        return conteudos;
    }

    public void setConteudos(Conteudo[] conteudos) {
        this.conteudos = conteudos;
    }

    public Dev[] getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Dev[] devsInscritos) {
        this.devsInscritos = devsInscritos;
    }
}
