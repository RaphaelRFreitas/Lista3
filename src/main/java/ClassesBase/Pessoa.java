package ClassesBase;

public class Pessoa {
    public String nome;
    public long cpf;

    public Endereco enderecos[];

    public Pessoa(String nome,long cpf,int qtdEnd){
        this.nome = nome;
        this.cpf = cpf;
        enderecos = new Endereco[qtdEnd];
    }

    public void addEndereco(Endereco end){
        for (int i = 0; i < enderecos.length; i++) {
            if(enderecos[i] == null){
                enderecos[i] = end;
                break;
            }
        }
    }

    public void mostraInfo(){
        System.out.print(
                "Nome='" + nome  +
                ",\nCpf=" + cpf +
                "\n\nEndereços:-------------"
                );
        for (int i = 0; i < enderecos.length; i++) {
            if(enderecos[i] == null)
                break;
            else {
                System.out.print("\nEndereço "+ (i+1) + ": " +
                enderecos[i].rua + "," +
                enderecos[i].bairro + "," +
                enderecos[i].num
                );
            }
        }
    }
}
