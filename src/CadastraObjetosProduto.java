import java.util.Scanner;

public class CadastraObjetosProduto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Produto obj1 = new Produto();
        System.out.println("Digite o código:");
        obj1.codigo = entrada.nextInt();
        System.out.println("Digite o nome:");
        obj1.nome = entrada.next();
        System.out.println("Digite a quantidade:");
        obj1.quantidade = entrada.nextFloat();
        System.out.println("Digite o preço de custo:");obj1.precoCusto = entrada.nextFloat();
        System.out.println("Digite o preço de venda:");
        obj1.precoVenda = entrada.nextFloat(); 
    }
}
