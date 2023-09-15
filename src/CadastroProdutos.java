/*
 * Faça um programa que receba uma lista com 10 produtos de um mercado, armazenando as informações da seguinte forma: 
Código Produto, Quantidade, Preço de Custo, Preço de Venda 
-Armazene em uma matriz, calcule e mostre: 
-O código e a quantidade dos produtos com maior preço de venda 
-A média de preço de custo de todos os produtos 
-O lucro obtido na venda de cada produto 
 */

import java.util.Scanner;

public class CadastroProdutos {
    public static void main(String[] args) {
        float produtos[][] = new float[10][4];
        float maiorPrecoVenda =0, codigoMaiorPrecoVenda=0,quantidadeMaiorPrecoVenda=0, somaPrecoVenda=0;
        String mensagem = new String();
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 3; i++) { //produtos
            System.out.println("############# Produto "+ (i+1) + " #############");
            //valores de cada produto
            //for (int j = 0; j < 4; j++) { 
                System.out.println("Digite o codigo:");
                produtos[i][0] = entrada.nextFloat();
                System.out.println("Digite a quantidade:");
                produtos[i][1] = entrada.nextFloat();
                System.out.println("Digite o preço de custo:");
                produtos[i][2] = entrada.nextFloat();
                System.out.println("Digite o preço de venda:");
                produtos[i][3] = entrada.nextFloat();
                if(produtos[i][3]>maiorPrecoVenda){
                    maiorPrecoVenda = produtos[i][3];
                    codigoMaiorPrecoVenda = produtos[i][0];
                    quantidadeMaiorPrecoVenda = produtos[i][1];
                }
                somaPrecoVenda = produtos[i][2];
                //System.out.println(" --- O lucro deste produto é de " + 
                //(produtos[i][3]-produtos[i][2]) + " ---");
                mensagem+="\nO lucro do produto "+ (i+1) + " é de "+
                (produtos[i][3]-produtos[i][2]);
            //}
        }
        System.out.println("Maior preço de venda é "+ maiorPrecoVenda + " do produto de código " + (int)codigoMaiorPrecoVenda + " que possui " + quantidadeMaiorPrecoVenda + " em estoque.");
        System.out.println("Média dos preços de custo " + (somaPrecoVenda/3));
        System.out.println(mensagem);
    }
}
