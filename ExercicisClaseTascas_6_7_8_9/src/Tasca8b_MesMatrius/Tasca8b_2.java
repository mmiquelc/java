package Tasca8b_MesMatrius;

public class Tasca8b_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int x = 10;
		final int y = 10;
		
		int Array[][] = new int [x][y];
		
		 for (int i = 0; i < Array.length; i++) {
			 for (int j = 0; j < Array.length; j++) {
				 Array[i][j] = (int) (Math.random() * 10); 
	         }
	     }
		 
		 int total = 0;
		 int total2 =0;
		 String a = "";
		 
	     for (int i = 0; i < Array.length; i++) {
	    	 for (int j = 0; j < Array.length; j++) {
	    		 System.out.print(Array[i][j] + " ");
	    		 total += Array[i][j];
	    		 total2 += Array[j][i];
	         }
	    	 
	    	 System.out.print("|");
	    	 System.out.print(total);
	    	 a += total2 + " ";
	    	 total =0;
	    	 total2 =0;
	    	 System.out.println(); 
	     }
	    
	     System.out.println("--------------------+");
	     System.out.println(a);
	}

}
