package vetoriais;
import java.util.Scanner;
public class Vetorfatorial {
	public static void main(String args[]) {
		 Scanner in = new Scanner (System.in);
		  int i = 0, a[], b[], j = 0, f;   
		  a = new int [15];
		  b = new int [15];
		  
		  for(i=0; i<15; i++) {  
		  
		  System.out.println("digite o "+(i+1)+" valor");
		  a[i] = in.nextInt();
		  
		  }
		  
		  
		  for(i=0; i<15; i++) {
			  f = 1;
			  for (j=1; j<=a[i]; j++) {
			      f = f * j;
			    }
			  
			    b[i] = f;
			    System.out.println(b[i]);
		  }

}
}
