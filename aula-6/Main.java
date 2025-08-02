import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);	
	/*	System.out.printf("Digite seu nome : ");
		String nome = entrada.nextLine();
		String stringSemEspacos = nome.replaceAll("\\s+", "");
		int tamanho = nome.length();
		System.out.print("Olá " + nome + ", Seu nome tem " + tamanho + " caracteres");
		
		
		System.out.printf("Digite a palavra secreta : ");
		String senha = "BATATA";
		String palavra = entrada.nextLine();
		boolean resultado = (palavra.equalsIgnoreCase(senha));
        System.out.println(senha.equals("BATATA"));
        if (resultado == true)
        {
            System.out.printf("Parabéns, voce acertou!");
        }
        else {
            System.out.printf("Que pena, voce errou!");
        }
		*/
		
    

        
       
		
		
		
	}
}

public class Main
{
	public static void main(String[] args) {
	
		
		String nome_produto1 = "morango do amor";
	double preco1 = 20.99;
	int quantidade1 = 6;
	String nome_produto2 = "labubu";
	double preco2 = 9.99;
	int quantidade2 = 3;
	String nome_produto3 = "pistache";
	double preco3 = 11.50;
	int quantidade3 = 10;
	double estoque1 = preco1 * quantidade1;
    	System.out.println (nome_produto1 + " " + estoque1 + " R$");
	double estoque2 = preco2 * quantidade2;
	    System.out.println (nome_produto2 + " " +estoque2 + " R$");
	double estoque3 = preco3 * quantidade3;
	    System.out.println (nome_produto3 + " " + estoque3 + " R$");
	
    double maior;
    
	    if (estoque1 > estoque2) {
            maior = estoque1;
        } else {
            maior = estoque2;
        }
       
        if (estoque3 > maior) {
            maior = estoque3;
        }
        System.out.println(" ");
        System.out.println("O maior valor entre os produtos em estoque é: " + maior + " R$");
        }
	}
