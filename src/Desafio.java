import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double saldo = 2500;
        String nome = "Ian Cormack";
        String tipoConta = "Corrente";
        int escolha =0;

        System.out.println("*****************************************");
        System.out.println("\nDados iniciais do cliente:");
        System.out.println("Nome:             " + nome);
        System.out.println("Tipo de Conta:    " + tipoConta);
        System.out.println("Saldo:            R$ " + saldo);
        System.out.println("\n*****************************************");

        String menu = """
                ***Operações***
                
                1- Consultar saldo
                2- Deposito
                3- Saque
                4- Sair
                
                Digite a opção desejada
                """;
        while (escolha != 4) {
            System.out.println(menu);
            escolha = leitura.nextInt();
            if (escolha == 1) {
                System.out.println("Seu saldo é: R$" + saldo);
            }
            if (escolha == 2) {
                System.out.println("Quanto deseja depositar? ");
                double deposito = leitura.nextDouble();
                saldo += deposito;
            }
            if (escolha == 3) {
                System.out.println("Quanto deseja sacar? ");
                double saque = leitura.nextDouble();
                saldo -= saque;

            }
            else {
                System.out.println("Escolha uma opção válida ");

            }

        }
        System.out.println("Operações finalizadas. ");

    }
}