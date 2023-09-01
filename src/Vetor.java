import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        int qtdeNotas = 0;
        float somaNotas=0, media=0;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("Digite a quantidade de notas:");
            qtdeNotas = entrada.nextInt();
        } while (qtdeNotas<=0);
        float notas[] = new float[qtdeNotas];
        for (int i = 0; i < notas.length; i++) {
            do{ //validação
                System.out.println("Digite a nota "+ (i+1) +":");
                notas[i] = entrada.nextFloat();
            }while(notas[i]<0 || notas[i]>10);
            somaNotas+=notas[i];//somaNotas=somaNotas+notas[i]
        }
        //somaNotas = notas[0]+notas[1]+notas[2]+notas[3];
        //media = somaNotas/4;
        media = somaNotas/notas.length;
        System.out.println("Média: " + media);
    }
}
