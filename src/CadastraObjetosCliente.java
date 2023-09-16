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

        objCliente.mostrar();

        Cliente objCliente2 = new Cliente();
        objCliente2.mostrar();
        System.out.println("Digite o CPF:");
        objCliente2.CPF = entrada.next();
        System.out.println("Digite o RG:");
        objCliente2.RG = entrada.next();
        System.out.println("Digite o Nome:");
        objCliente2.nome = entrada.next();
        System.out.println("Digite o E-mail:");
        objCliente2.email = entrada.next();
        System.out.println("Digite o Endereço:");
        objCliente2.endereco = entrada.next();
        System.out.println("Digite a empresa:");
        objCliente2.empresa = entrada.next();

        objCliente2.mostrar();

        objCliente.mostrar();
    }
}
