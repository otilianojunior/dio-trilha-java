package one.digitalinovation.desafios.bootcamp;

public class Curso extends Conteudo{
    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return xpPadrao * cargaHoraria;
    }
    public Curso() {
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return String.format(
                "\n"+ "Curso = { " + "Título: '%s', " + "Descricao: '%s', " + "Carga Horária: %sh }", getTitulo(), getDescricao(), cargaHoraria);
    }


}
