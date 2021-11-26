package vetoriais;
import java.util.Scanner;
public class Vetorprimos {
	  public static void main(String args[]) {
		  Scanner in = new Scanner (System.in);
		  int a[], i, divisao = 0;
		  a = new int [10];
		  
		  
         for (int j=0; j<10; j++) {
             divisao=0;
             
             
          System.out.println("Entre com um numero inteiro");
          a[j] = in.nextInt();
          
          for (i=1; i<=a[j]; i++) {
        	  if (a[j]%i == 0) {
        		  divisao++;
        	  }
          }
          
          if(divisao > 2) {
        	  System.out.println("Não é Primo");
        	  System.out.println();
          }else {
        	  if(divisao > 2) {
            	  System.out.println("É Primo");
            	  System.out.println();
          }
        }  
      }	 
   }       	  
}        