package vetoriais;
import java.util.Scanner;
public class Vetorverificacao {
		public static void main (String args[]) {
			Scanner in = new Scanner (System.in);
			            int a[], b[], i = 0, j = 0, k;
			             a = new int [10];
			             b = new int [1];
			             int encontrar = 0;

			             //leitura do valor A
			             for(i=0; i<10; i++) {
			                 System.out.println("digite o "+(i+1)+" valor de A");
			                 a[i] = in.nextInt();

			             }

			             //leitura do valor B

			             for(i=0; i<1; i++) {
			                 System.out.println("digite o "+(i+1)+" valor de B");
			                  b[i] = in.nextInt();
			             }

			             k = 0;

			             for(i=0; i<10; i++) {
			                     if(a[i] == b[j]) {
			                      encontrar = 1;
			                     }
			                 }
			                 if(encontrar == 1) {
			                System.out.println("o numero esta presente no vetor");
			                 }else {
			                	 System.out.println("o numero não esta presente");
			                 }

			             }
			    
			          }

