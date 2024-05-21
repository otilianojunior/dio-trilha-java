package one.digitalinovation.desafios.bootcamp;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate data;

    @Override
    public double calcularXp() {
        return xpPadrao + 20;
    }

    public Mentoria() {
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return String.format(
                "\n" + "Mentoria = { " + "Título: '%s', " + "Descriçãoo: '%s', " + "Data: %s " + "}", getTitulo(), getDescricao(), data);
    }


}
