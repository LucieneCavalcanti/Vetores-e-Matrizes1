import java.util.Scanner;

public class CadastraVariosObjetos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Produto vetorProdutos[] = new Produto[10];
        for (int i = 0; i < vetorProdutos.length; i++) {
            vetorProdutos[i] = new Produto();
            System.out.println("Digite o código:");
            vetorProdutos[i].codigo = entrada.nextInt();
            System.out.println("Digite o nome:");
            vetorProdutos[i].nome = entrada.next();
            System.out.println("Digite a quantidade:");
            vetorProdutos[i].quantidade = entrada.nextFloat();
            System.out.println("Digite o preço de custo:");
            vetorProdutos[i].precoCusto = entrada.nextFloat();
            System.out.println("Digite o preço de venda:");
            vetorProdutos[i].precoVenda = entrada.nextFloat(); 
        }
    }
}
