import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /* Faça um programa que receba o salário de um funcionário
        e a porcentagem de aumento, calcule e mostre o novo
        salário acrescido do aumento. */
        float salario, porcentagem, aumento, novosalario;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o salário:");
        salario = entrada.nextFloat();
        System.out.println("Digite a porcentagem de aumento:");
        porcentagem = entrada.nextFloat();
        aumento = salario*porcentagem/100;
        novosalario = salario+aumento;
        System.out.println("Novo salário: "+ novosalario);
    }
}
