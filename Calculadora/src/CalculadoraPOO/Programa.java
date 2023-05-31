package CalculadoraPOO;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor, digite seu nome: ");

        String nome = teclado.nextLine();

        System.out.println("Selecione seu metodo de pagamento: 1=CLT, 2=Horista ou 3=PJ");
        String regime = teclado.nextLine();

        Professor professor= null;

        if (regime.equals("CLT")) {
            professor = new ProfessorCLT();
            System.out.print("Salário mensal: ");
            double valorSalarioMensal = teclado.nextDouble();
            ((ProfessorCLT) professor).setValorSalarioMensal(valorSalarioMensal);
        } 
        else if (regime.equals("Horista")) {
            professor = new ProfessorHorista();
            System.out.print("Número de horas trabalhadas: ");
            int numeroHorasAula = teclado.nextInt();
            System.out.print("Valor da hora de trabalho: ");
            double valorHoraAula = teclado.nextDouble();
            ((ProfessorHorista) professor).setNumeroHorasAula(numeroHorasAula);
            ((ProfessorHorista) professor).setValorHoraAula(valorHoraAula);
        } 
        else if (regime.equals("PJ")) {
            professor = new ProfessorPJ();
            System.out.print("Valor do contrato: ");
            double valorContrato = teclado.nextDouble();
            ((ProfessorPJ) professor).setValorContrato(valorContrato);
        }

        System.out.println("Nome: " + nome);
        System.out.println("Valor a Receber: " + professor.calcularValorAReceber());


        teclado.close();
    }

        
    }
