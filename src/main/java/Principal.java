import ClassesBase.*;

public class Principal {
    public static void main(String[] args) {
        long cpf = Long.parseLong("13822882631");
        Pessoa p1 = new Pessoa("Raphael", cpf,2);
        Endereco e1 = new Endereco("Andre Fernands","Nova Suiça",100);
        Endereco e2 = new Endereco("1 de abril","Centro",65);

        p1.addEndereco(e1);
        p1.addEndereco(e2);

        p1.mostraInfo();
    }
}
