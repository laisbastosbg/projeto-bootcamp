public class Curso extends Conteudo{

    private int cargaHoraria;

    public Curso() {
 
    }

    public double calcularXp() {
        return XP_BASE * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    @Override
    public String toString() {
        return "Curso\n" +
                "\ttitulo: " + getTitulo() + '\n' +
                "\tdescricao: " + getDescricao() + '\n' +
                "\tcargaHoraria: " + cargaHoraria + "\n" +
                "\tXP: " + calcularXp() +
                '\n';
    }
}
