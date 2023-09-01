import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        float notas[] = new float[6];
        float somaNotas=0, media=0;
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota "+ (i+1) +":");
            notas[i] = entrada.nextFloat();
            somaNotas+=notas[i];//somaNotas=somaNotas+notas[i]
        }
        //somaNotas = notas[0]+notas[1]+notas[2]+notas[3];
        //media = somaNotas/4;
        media = somaNotas/notas.length;
        System.out.println("Média: " + media);
    }
}
