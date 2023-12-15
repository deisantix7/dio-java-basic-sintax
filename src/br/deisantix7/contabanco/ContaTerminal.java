package br.deisantix7.contabanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Número da conta: ");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.print("Número da agência: ");
        String agencia = sc.nextLine();

        System.out.print("Nome do cliente: ");
        String nome = sc.nextLine();

        System.out.print("Saldo da conta: ");
        Double saldo = sc.nextDouble();

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %6.2f já está disponível para saque",
                nome,
                agencia,
                numero,
                saldo
        );
    }
}
