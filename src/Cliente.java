public class Cliente {
    int id;
    String CPF;
    String email;
    String nome;
    String RG;
    String endereco;
    String empresa;
    public void mostrar(){
        System.out.println("CPF: "+CPF +
        "\nNome:"+nome + "\nRG:" + RG + "\nE-mail: "+
        email + "\nEndereço: " + endereco + "\nEmpresa: "+empresa);
    }
}
