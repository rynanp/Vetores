package vetoriais;
import java.util.Scanner;
public class Vetoresiguais {
	public static void main (String args[]) {
		Scanner in = new Scanner (System.in);
		            int a[], b[], c[], i = 0, j = 0, k;
		             a = new int [10];
		             b = new int [10];
		             c = new int [10];
		             int encontrar = 0;

		             //leitura do valor A
		             for(i=0; i<10; i++) {
		                 System.out.println("digite o "+(i+1)+" valor de A");
		                 a[i] = in.nextInt();

		             }

		             //leitura do valor B

		             for(i=0; i<10; i++) {
		                 System.out.println("digite o "+(i+1)+" valor de B");
		                  b[i] = in.nextInt();
		             }

		             k = 0;

		             for(i=0; i<10; i++) {
		                 encontrar = 0;
		                 for(j=0; j<10; j++) {
		                     if(a[i] == b[j]) {
		                      encontrar = 1;
		                     }
		                 }
		                 if(encontrar == 1) {
		                     c[k] = a[i]; 
		                     k++;
		                 }

		             }
		             System.out.print("Valores do vetor A");
		             for(i=0; i<10; i++) {

		                 System.out.print(" "+a[i]);
		             }
		             System.out.println();
		             System.out.print("Valores do vetor B");
		             for(i=0; i<10; i++) {

		                 System.out.print(" "+b[i]);
		             }
		             System.out.println();
		             System.out.print("Valores do vetor C");
		             for(i=0; i<10; i++) {

		                 System.out.print(" "+c[i]);
		             }
		    }
		}