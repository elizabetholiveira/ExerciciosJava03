import java.text.DecimalFormat;
import java.util.Scanner;

public class PostoDeCombustivel {

    public static void main(String[] args) {

        /* Álcool:
            até 20 litros, desconto de 3% por litro
            acima de 20 litros, desconto de 5% por litro
            R$1,90 por litro
            Gasolina:
            até 20 litros, desconto de 4% por litro
            acima de 20 litros, desconto de 6% por litro
            R$2,50 por litro

            - Litros vendidos
            - Tipo de combustível
                A = Álcool
                G = Galosina
            - Valor a ser pago
         */

        System.out.println("Bem-vindo ao nosso posto!");

        Scanner resp = new Scanner(System.in);

        System.out.println("Selecione o tipo de combustível:");
        System.out.println("A - Álcool");
        System.out.println("G - Gasolina");
        String combTipo = resp.next();

        System.out.println("Quantos litros de combustível você deseja?");
        double combQuant = resp.nextDouble();

        /*double alcoolQuant = 0;
        double gasolinaQuant = 0;*/

        double alcoolValor = 1.90;
        double gasolinaValor = 2.50;

        //double combValor = 0;

        //combustivelAbastecido = combTipo
        //litrosVendidos = combQuant

        DecimalFormat dinheiro = new DecimalFormat("#,##0.00");

        if (combTipo.equalsIgnoreCase("a")){
            if (combQuant <= 20){
                double descontoAlcool = (combQuant * alcoolValor) * 0.03;
                double precoNormal = combQuant * alcoolValor;
                System.out.println("O valor sem desconto em reais é " + dinheiro.format(precoNormal));
                double precoFinalComDesconto = (combQuant * alcoolValor) - descontoAlcool;
                System.out.println("Você recebeu 3% de desconto, ficando o total de: R$ " + dinheiro.format(precoFinalComDesconto));
            } else {
                double descontoAlcool = (combQuant * alcoolValor) * 0.05;
                double precoNormal = combQuant * alcoolValor;
                System.out.println("O valor sem desconto em reais é " + dinheiro.format(precoNormal));
                double precoFinalComDesconto = (combQuant * alcoolValor) - descontoAlcool;
                System.out.println("Você recebeu 5% de desconto, ficando o total de: R$ " + dinheiro.format(precoFinalComDesconto));
            }

        } else if (combTipo.equalsIgnoreCase("g")) {
            if (combQuant <= 20){
                double descontoGasolina = (combQuant * gasolinaValor) * 0.04;
                double precoNormal = combQuant * gasolinaValor;
                System.out.println("O valor sem desconto em reais é " + dinheiro.format(precoNormal));
                double precoFinalComDesconto = (combQuant * gasolinaValor) - descontoGasolina;
                System.out.println("Você recebeu 4% de desconto, ficando o total de: R$ " + dinheiro.format(precoFinalComDesconto));
            } else {
                double descontoGasolina = (combQuant * gasolinaValor) * 0.06;
                double precoNormal = combQuant * gasolinaValor;
                System.out.println("O valor sem desconto em reais é " + dinheiro.format(precoNormal));
                double precoFinalComDesconto = (combQuant * gasolinaValor) - descontoGasolina;
                System.out.println("Você recebeu 6% de desconto, ficando o total de: R$ " + dinheiro.format(precoFinalComDesconto));
            }
        }

        //double pagamento = combValor * combQuant;

        /*double finalPg = 0;

        if (combTipo.equalsIgnoreCase("A")){
            combValor = alcoolValor;
            double finalPg = 0;
            if (combQuant <= 20) {
                double finalPg = ((3 * alcoolValor) / 100) * combQuant;
            } else if (combQuant > 20) {
                double finalPg = ((5 * alcoolValor) / 100) * combQuant;
            }
        } else if (combTipo.equalsIgnoreCase("G")) {
            combValor = gasolinaValor;
            if (combQuant <= 20) {
                double finalPg = ((4* gasolinaValor) / 100) * combQuant;
            } else if (combQuant > 20) {
                double finalPg = ((6 * gasolinaValor) / 100) * combQuant;
            }
        }

        DecimalFormat dinheiro = new DecimalFormat(0.00);

        System.out.println("O total deu: R$" + dinheiro.format(finalPg));

        /*
        if (combTipo.equalsIgnoreCase("A")){
            combValor = alcoolValor;
            combQuant = alcoolQuant;
        } else if (combTipo.equalsIgnoreCase("G")) {
            combValor = gasolinaValor;
            combQuant = gasolinaQuant;

        }

        if ((combQuant <= 20) && (combValor = alcoolValor)){
            double finalPg = (3 * pagamento) / 100;
        }else if ((combQuant > 20) && (combValor = alcoolValor)){
            double finalPg = (5 * pagamento) / 100;
        }

        if ((combQuant <= 20) && (combValor = gasolinaValor)){
            double finalPg = (4 * pagamento) / 100;
        } else if ((combQuant > 20) && (combValor = gasolinaValor)) {
            double finalPg = (6 * pagamento) / 100;

        } */

        // Agradecimentos especiais para Gaby <3

        // Linha de segurança

    }

}