package exercicio_conversao_temp;

import java.util.Scanner;
//Receba a temperatura em graus celsius e apresente convertido em fahrenheit de 10 em 10 até 100.

public class Exercicio_conversao_temp 
{

    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        double c, f, result;
        
        System.out.println("Digite a temperatura em Celsius: ");
        c = entrada.nextDouble();
        
        do 
        {
            f = c * 1.8 + 32;
            System.out.println("A temperatura " + c + " convertida em Fahrenheit é: " + f);
            c = c + 10;
            
        } while (c <= 100);
    }  
}
