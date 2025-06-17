import java.util.Date;

public class Curso extends Conteudo{
    private Date data;

    private double cargaHoraria;

    public Curso(String titulo, String descricao, Date data, double cargaHoraria) {
        this.setTitulo(titulo);
        this.setDescricao(descricao);
        this.data = data;
        this.cargaHoraria = cargaHoraria;
    }

    public double calcularXp() {
        return XP_BASE * cargaHoraria;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
}
