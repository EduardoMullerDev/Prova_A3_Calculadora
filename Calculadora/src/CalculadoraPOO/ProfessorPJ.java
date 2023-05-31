package CalculadoraPOO;

public class ProfessorPJ extends Professor {
    private double valorContrato;

    public double getValorContrato() {
        return valorContrato;
    }

    public void setValorContrato(double valorContrato) {
        this.valorContrato = valorContrato;
    }

    public double calcularValorAReceber() {
        return valorContrato;
    }
}

    