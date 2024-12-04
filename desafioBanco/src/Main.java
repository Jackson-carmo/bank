import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String nome = "Jackson";
        String tipoConta = "Corrente";
        double saldo = 3000;

        int menu = 0;

        while (menu != 4) {

            System.out.println("""
                    *************************
                    Dados iniciais do cliente
                    *************************
                    """
                    );
            System.out.println("Nome: " + nome);
            System.out.println("Tipo: " + tipoConta);
            System.out.println("Saldo inicial: " + saldo);

            System.out.println("-----Menu-----");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Receber Valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair");
            System.out.println("Escolha uma opção - ");
            menu = scanner.nextInt();

            if (menu == 1) {

                System.out.println("Seu saldo e de : " + saldo);
            } else if (menu == 2) {
                double valor;
                System.out.println("Digite o valor a ser depositado: ");
                valor =scanner.nextDouble();
                saldo += valor;
                System.out.println("Deposito realizada com sucesso. Novo saldo: R$ " + saldo);

            } else if (menu == 3) {
                System.out.println("Digite  o valor a ser trasferido: ");

                double valorTransferido = scanner.nextDouble();
                if (valorTransferido <= saldo) {
                    saldo -= valorTransferido;
                    System.out.println("Transferência realizada com sucesso. Novo saldo: R$ " + saldo);
                } else {
                    System.out.println("Valor indisponivel!");
                }
            } else if (menu == 4) {
                System.out.println("Saindo do sistema ....");
            } else {
                System.out.println("Opcao invalida!");
            }

        }
    }
}