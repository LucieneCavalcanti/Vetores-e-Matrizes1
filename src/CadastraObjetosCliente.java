import java.util.Scanner;

public class CadastraObjetosCliente {
    public static void main(String[] args) {
        Cliente objCliente = new Cliente();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o CPF:");
        objCliente.CPF = entrada.next();
        System.out.println("Digite o RG:");
        objCliente.RG = entrada.next();
        System.out.println("Digite o Nome:");
        objCliente.nome = entrada.next();
        System.out.println("Digite o E-mail:");
        objCliente.email = entrada.next();
        System.out.println("Digite o Endereço:");
        objCliente.endereco = entrada.next();
        System.out.println("Digite a empresa:");
        objCliente.empresa = entrada.next();

        System.out.println("CPF: "+objCliente.CPF +
        "\nNome:"+objCliente.nome + "\nRG:" + objCliente.RG + "\nE-mail: "+objCliente.email + "\nEndereço: " + objCliente.endereco + "\nEmpresa: "+objCliente.empresa);
    }
}
