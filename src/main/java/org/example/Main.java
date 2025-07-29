package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       String nome = "Clark";
       String tipoConta = "Corrente";
       double saldo = 1599.99;

        System.out.println(" *****************************");
        System.out.printf("\n Nome do cliente: " + nome);
        System.out.printf("\n Tipo de conta: " + tipoConta);
        System.out.printf("\n Saldo: " + saldo);
        System.out.println("\n *****************************");

        int opcao = 0;

        String menu = """  
               \n ** Digite sua opção **
                   1- Consultar saldo
                   2- Transferir valor
                   3- Receber valor
                   4- Sair
                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4){
            System.out.printf(menu);
            opcao = leitura.nextInt();

            if(opcao == 1){
                System.out.printf("\n O saldo atualizado é: " + saldo);
            }else if(opcao == 2){
                System.out.printf("\n Qual o valor que deseja transferir ?");
                double valor = leitura.nextDouble();
                if(valor > saldo){
                    System.out.printf("\n Não há saldo para realizar essa transferência.");
                }else {
                    saldo -= valor;
                    System.out.printf("\n Novo saldo é de:" + saldo);
                }
            }else if(opcao == 3){
                System.out.printf("\n Valor recebido: " );
                double  valor = leitura.nextDouble();
                saldo += valor;
                System.out.printf("\n Novo saldo é de: " + saldo);
            }else if(opcao != 4){
                System.out.printf("Opção inválida");
            }
        }

    }
}