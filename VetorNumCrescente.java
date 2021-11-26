package vetoriais;
import java.util.Scanner;
public class VetorNumCrescente {
	public static void main (String args[]) {
		Scanner in = new Scanner (System.in);
		int i=0, j=0, a[], numreserva;
		a = new int [10];
		
		for(i=0; i<10; i++) {
			 System.out.println("digite o "+(i+1)+" valor");
			 a[i] = in.nextInt();
		}
		
		for(i=0; i<10; i++) {
		 for(j=i+1; j<10; j++) {
			 if (a[i] > a[j]) {
				 numreserva = a[i];
				 a[i] = a[j];
				 a[j] = numreserva;
			 }		 
		 }
	}
		
		   for(i=0; i<10; i++) {
               System.out.print(" "+a[i]);
           }
	}
}
		
