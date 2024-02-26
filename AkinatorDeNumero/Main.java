package AkinatorDeNumero;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        int nextStep;
        int algarismos;
        int maiorMenor;

        System.out.println("Pense num número inteiro positivo! - Insira 1 para o próximo passo.");
        nextStep = s.nextInt();

        if(nextStep == 1){

            nextStep = 0;
            System.out.println("Quantos algarismos tem seu número pensado?");
            algarismos = s.nextInt();
            System.out.println("Seu número é maior ou menor que "+Math.pow(10, algarismos)/2+"? - 1 para maior e 0 para menor.");
            maiorMenor = s.nextInt();
            if(maiorMenor == 1){

                
            }
        }
    }

}
