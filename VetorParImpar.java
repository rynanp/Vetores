package vetoriais;
import java.util.Scanner;
public class VetorParImpar {
	public static void main (String args[]) {
		Scanner in = new Scanner (System.in);
		int a[], i, contIm=0, contPa=0;
		a = new int [5];
		
		        for(i=0; i<5; i++) {
                System.out.println("Entre com o "+(i+1)+"° numero");
                a[i] = in.nextInt();
		   
		        if (a[i] % 2 == 0) {
		        	contPa++;
		        }else {
		        	contIm++;
		        }
		        }
		        
		        System.out.println("A quantidade de pares é "+contPa+" e de impares é "+contIm);
		        int par[], impar[];
		        par = new int [contPa];
		        impar = new int [contIm];
		        
		        
		        int par1=0;
		        int impar1=0;
		          for(i=0; i<5; i++) {
		        	  if (a[i] % 2 == 0) {
		        		  par[par1]= a[i];
		        		      par1++;
		        	  } else {
		        		  impar[impar1]= a[i];
	        		      impar1++;
		        	  }
		          }
		             for(i=0; i<5; i++) {
		                 System.out.print(" "+a[i]);
		             }
		             System.out.println();
		             System.out.print("Valores pares");
		             for(i=0; i<contPa; i++) {

		                 System.out.print(" "+par[i]);
		             }
		             System.out.println();
		             System.out.print("Valores impares");
		             for(i=0; i<contIm; i++) {

		                 System.out.print(" "+impar[i]);
		        
		        
		        
		   
		             }
				}
			}