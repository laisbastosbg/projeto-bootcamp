import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;

    public Mentoria() {}

    public double calcularXp() {
        return XP_BASE + 20d;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria\n" +
                "\ttitulo : " + getTitulo() + '\n' +
                "\tdescricao: " + getDescricao() + '\n' +
                "\tdata:" + data + "\n";
    }
}
