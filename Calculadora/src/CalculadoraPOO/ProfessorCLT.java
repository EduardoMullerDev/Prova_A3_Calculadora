package CalculadoraPOO;

public class ProfessorCLT extends Professor {
    private double valorSalarioMensal;

    public double getValorSalarioMensal() {
        return valorSalarioMensal;
    }

    public void setValorSalarioMensal(double valorSalarioMensal) {
        this.valorSalarioMensal = valorSalarioMensal;
    }

    public double calcularValorAReceber() {
        return valorSalarioMensal;
    }
}
