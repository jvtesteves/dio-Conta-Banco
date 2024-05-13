package com.jvtesteves;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta!");
        int numero = scanner.nextInt();

        // Limpar buffer
        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o Nome do Cliente!");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o Saldo!");
        double saldo = scanner.nextDouble();

        // Concatenação das informações
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";

        // Exibir a mensagem
        System.out.println(mensagem);

        // Fechar o scanner
        scanner.close();
    }
}
