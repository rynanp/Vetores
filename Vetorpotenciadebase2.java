package vetoriais;
public class Vetorpotenciadebase2 {
	public static void main(String args[]) {
		int a[], i;
		 a = new int [11];
		 double y = 1, x = 0;
		 
		 
		 for(i=0; i<11; i++) {
			 
			 
			a[i] = (int) Math.pow(2, y);

			 
	 System.out.println(a[i]);
	 y++;
		 }
		 
		 
	}

}
