import java.util.Scanner;

public class InterrogatorioCriminal {
    public static void main(String[] args) {
        System.out.println("Responda as perguntas abaixo com 1 = sim ou 0 = não.");

        Scanner quest = new Scanner(System.in);

        System.out.println("Telefonou para a vítima? (1 = sim / 0 = não)");
        int resp1 = quest.nextInt();
        System.out.println("Esteve no local do crime? (1 = sim / 0 = não)");
        int resp2 = quest.nextInt();
        System.out.println("Mora perto da vítima? (1 = sim / 0 = não)");
        int resp3 = quest.nextInt();
        System.out.println("Devia para a vítima? (1 = sim / 0 = não)");
        int resp4 = quest.nextInt();
        System.out.println("Já trabalhou com a vítima? (1 = sim / 0 = não)");
        int resp5 = quest.nextInt();

        int result = resp1 + resp2 + resp3 + resp4 + resp5;

        if (result == 5) {
            System.out.println("Assassino!");
        } else if (result <= 1) {
            System.out.println("Inocente!");
        } else if (result == 2) {
            System.out.println("Suspeita...");
        }else {
            System.out.println("Cúmplice");

        }

    }
    }


