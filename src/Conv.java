import java.util.Scanner;

public class Conv {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double c = 0; 
        double f = 0;
        char resp;

        System.out.println("Vamos fazer a conversão entre Celsius e Fahrenheit!");
        
        do{
            System.out.print("Insira a temperatura em Celsius: ");
            c = input.nextDouble();
            f = c * 1.8 + 32;
            System.out.printf("A temperatura em Fahrenheit é %.1f%n",f);
            System.out.print("Deseja continuar? (s/n): ");
            resp = input.next().charAt(0);

        }while(resp != 'n');
        
        System.out.println("Volte Sempre!");

        input.close();
    }
}
