package com;

import java.util.Scanner;

/**
 * Created by isa on 3/24/15.
 */
public final class IOHandler {

    public static void sendStartMessage() {
        System.out.print("Saiba quantas rodas tem o seu automóvel. Digite:\n" +
                "1 para carro\n" +
                "2 para moto\n" +
                "9 para sair\n" +
                "Resposta: ");
        getInput();
    }

    public static void sendAnswer(Automobile automobile) {
        System.out.println("\nA quantidade de rodas do(a) " + automobile.getType().getAutomobileType() + " é " + automobile.getNumberOfWheels() + "\n\n");
    }

    public static void sendErrorMessage(String response) {
        System.out.printf(String.format("A opção %s não é válida. Por favor, tente novamente!\n\n", response));
    }

    public static void getInput() {
        Scanner scanner = new Scanner(System.in);
        String response = scanner.nextLine();
        ResponseProcessor.processResponse(response);
    }
}