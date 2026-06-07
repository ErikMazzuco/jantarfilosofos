package jantarfilosofos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade de filósofos: ");
        int quantidade = scanner.nextInt(); //aqui se informa o quanto se quer

        if (quantidade < 2) {
            System.out.println(
                "É necessário pelo menos 2 filósofos.");
            scanner.close(); //só para sair o warning
            return;
        }

        Hashi[] hashis = new Hashi[quantidade]; //aqui cria o hashi conforme o tanto de filosofos

        for (int i = 0; i < quantidade; i++) {
            hashis[i] = new Hashi(i);
        }

        Filosofo[] filosofos = new Filosofo[quantidade]; // aqui cria os filosofos

        for (int i = 0; i < quantidade; i++) {

            Hashi esquerdo = hashis[i];
            Hashi direito = hashis[(i + 1) % quantidade];

            boolean invertido = (i == quantidade - 1); // a ideia é o ultimo pegar o hashi de traz

            filosofos[i] = new Filosofo(
                i,
                esquerdo,
                direito,
                invertido
            );
        }

        System.out.println();
        System.out.println("Iniciando jantar...");
        System.out.println();

        for (Filosofo f : filosofos) {
            f.start();
        }

        scanner.close();
    }
}