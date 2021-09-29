import ClassesBase.*;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 100;

        //Criar Pessoa
        System.out.println("Vamos criar a pessoa");
        System.out.print("Entre com nome da sua pessoa: ");
        String nP = sc.nextLine();
        System.out.print("Entre com o cpf: ");
        long cpfP = sc.nextLong();
        System.out.print("Quantos endereços ela tem?: ");
        int neP = sc.nextInt();
        Pessoa pessoa = new Pessoa(nP,cpfP,neP);

        while (op!=0) {
            System.out.println("\n-------------------------------");
            System.out.println("1- Adicionar endereço");
            System.out.println("2- Mostrar Informações");
            System.out.println("0- Sair");
            System.out.print("Oq vc deseja: ");
            op = sc.nextInt();
            sc.nextLine();

            if(op==1){
                System.out.println("Vamos criar uma Endereço");
                System.out.print("Entre com a rua: ");
                String rua = sc.nextLine();
                System.out.print("Entre com o bairro: ");
                String bairro = sc.nextLine();
                System.out.print("Entre com o numero: ");
                int n = sc.nextInt();
                sc.nextLine();
                Endereco e1 = new Endereco(rua,bairro,n);
                pessoa.addEndereco(e1);
                System.out.println("Endereço adicionado com sucesso!!");
            }
            else if (op==2)
                pessoa.mostraInfo();
        }
    }
}
