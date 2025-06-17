import java.util.Date;

public class Mentoria extends Conteudo {
    private Date data;

    public Mentoria() {}

    public double calcularXp() {
        return XP_BASE + 20d;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
