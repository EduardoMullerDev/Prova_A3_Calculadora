package Calculadoraemumcodigo;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome do professor: ");
        String nome = teclado.nextLine();

        System.out.println("Selecione o regime de pagamento: 1. CLT,2. Horista,3. PJ");
        String regime = teclado.nextLine();

        double valorReceber = 0;

        if (regime.equals ("1")) {
            System.out.println("Digite o salário mensal: ");
            double salarioMensal = teclado.nextDouble();
            valorReceber = calcularValorReceberCLT(salarioMensal);
        } 
        else if (regime.equals ("2")) {
            System.out.println("Digite o número de horas trabalhadas: ");
            int horasTrabalhadas = teclado.nextInt();
            System.out.println("Digite o valor da hora de trabalho: ");
            double valorHoraTrabalho = teclado.nextDouble();
            valorReceber = calcularValorReceberHorista(horasTrabalhadas, valorHoraTrabalho);
        } 
        else if (regime.equals ("3")) {
            System.out.println("Digite o valor do contrato: ");
            double valorContrato = teclado.nextDouble();
            valorReceber = calcularValorReceberPJ(valorContrato);
        } 
        else {
            System.out.println("Opção inválida. Programa encerrado.");
    }
    System.out.println("Nome do professor: " + nome);
    System.out.println("Valor a receber: " + valorReceber);

    teclado.close();

}
public static double calcularValorReceberCLT(double salarioMensal) {
    return salarioMensal;
}

public static double calcularValorReceberHorista(int horasTrabalhadas, double valorHoraTrabalho) {
    return horasTrabalhadas * valorHoraTrabalho;
}

public static double calcularValorReceberPJ(double valorContrato) {
    return valorContrato;



}
}
