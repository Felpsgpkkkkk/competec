import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner entrada = new Scanner (System.in);	
	System.out.println("insira o tamanho da array: ");
    int num = entrada.nextInt();
    int arranjo[] = new int [num];
    System.out.printf("quais os numeros serão utilizados?");
    for(int i = 0; i < arranjo.length; i++){
        arranjo[i] = entrada.nextInt( );
        
    }
    System.out.printf("a array é: ");
    for (int i = 0; i < arranjo.length; i++){
        System.out.print (arranjo[i] + " ");
       
    }
	}        
  	}
	





	//  int num = entrada.nextInt();
       /* for (int i = 1; i <= 100; i++){
            System.out.print(10 * i);
            System.out.print(" "); 
            int numeros[] = {2, 6, 5};
            int soma;
            soma = numeros[0] + numeros[1] + numeros[2];
            numeros[0] = 2;
            numeros[1] = 6;
            numeros[2] = 5;
            System.out.print (soma); */
            
