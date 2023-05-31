package CalculadoraPOO;

public class ProfessorHorista extends Professor {
    private int numeroHorasAula;
    private double valorHoraAula;

    public int getNumeroHorasAula() {
        return numeroHorasAula;
    }

    public void setNumeroHorasAula(int numeroHorasAula) {
        if (numeroHorasAula < 0) {
            throw new IllegalArgumentException("Número de horas de aula não pode ser negativo");
        }
        this.numeroHorasAula = numeroHorasAula;
    }

    public double getValorHoraAula() {
        return valorHoraAula;
    }

    public void setValorHoraAula(double valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }

    public double calcularValorAReceber() {
        return valorHoraAula * numeroHorasAula;
    }
}
