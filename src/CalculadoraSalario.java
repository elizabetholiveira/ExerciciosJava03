import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculadoraSalario {

    public static void main(String[] args) {

        System.out.println("Olá, vamos calcular o seu salário líquido. Por favor, preencha as informações abaixo:");

        Scanner resp = new Scanner(System.in);

        System.out.print("Valor da hora de trabalho = ");
        double ganhoHora = resp.nextDouble();

        System.out.print("Quantidade de horas trabalhadas no mês = ");
        double horaMes = resp.nextDouble();

        /*  Salário Bruto até 900 (inclusive) - isento
            Salário Bruto até 1500 (inclusive) - desconto de 5%
            Salário Bruto até 2500 (inclusive) - desconto de 10%
            Salário Bruto acima de 2500 - desconto de 20% */

        double salarioBruto = ganhoHora * horaMes;

        double inss = (10 * salarioBruto) / 100;
        double fgts = (11 * salarioBruto) / 100;

        double impostoR;
        short porcentImpost;

        if (salarioBruto <= 900) {
            impostoR = 0;
            porcentImpost = 0;
        } else if (salarioBruto <= 1500) {
            impostoR = (5 * salarioBruto) / 100;
            porcentImpost = 5;
        } else if (salarioBruto <= 2500) {
            impostoR = (10 * salarioBruto) / 100;
            porcentImpost = 10;
        } else {
            impostoR = (20 * salarioBruto) / 100;
            porcentImpost = 20;
        }

        double salarioLiquido = salarioBruto - inss - impostoR;
        double totalDescontos = impostoR + inss + fgts;

        DecimalFormat dinheiro = new DecimalFormat("#,##0.00");

        System.out.println("Salário Bruto: (" + dinheiro.format(ganhoHora) + " * " + dinheiro.format(horaMes) + ") : R$ " + dinheiro.format(salarioBruto));
        System.out.println("(-) IR (" + porcentImpost + "%) : R$ " + dinheiro.format(impostoR));
        System.out.println("(-) INSS (10%) : R$ " + dinheiro.format(inss));
        System.out.println("FGTS (11%) : R$ " + dinheiro.format(fgts));
        System.out.println("Total de descontos : R$ " + dinheiro.format(totalDescontos));
        System.out.println("Salário Líquido : R$ " + dinheiro.format(salarioLiquido));

        }

    }
