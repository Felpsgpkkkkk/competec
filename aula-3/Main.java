import java.util.Scanner;
public class Main
{
    
    
	public static void main(String[] args) {
	    Scanner entrada = new Scanner (System.in);
	    /*
	    String palavra = entrada.nextLine();
        int x = 0;
        
	
	    while (x < 5) 
    	{
	        System.out.print (palavra + " ");
	        x++;
	    }
	    */
	    
	  /* int L = 1;
	    int resultado = 0;
        while (L <= 100)
        {
            resultado += L;
            System.out.print (resultado + ", ");
            L++;
        } */
        
        int num = entrada.nextInt();
               
               
        // num * 1
        // num * 2
        // ...
        // num * 10
        
        for (int i = 1; i <= 10; i++){
            System.out.print(num * i);
            System.out.print(" ");
        }
     /*   for (int i = 1; i <= 10; i++){
         if (i==2) break; 
            System.out.print(num * i);
            System.out.print(" ");
        
	} */
	for (boolean senha = true; senha == true;){
	    System.out.println("gotao");
	    senha = false;
	}
	
	
        System.out.println("");
       	System.out.println("eu sou bom, meu empresario q é ruim");
}   
}
