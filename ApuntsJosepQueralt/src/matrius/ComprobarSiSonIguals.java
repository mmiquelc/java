package matrius;

public class ComprobarSiSonIguals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Declaring Arrays m1 and m2
		int m1[] = {1, 2, 3};
		int m2[] = {1, 3, 3};
		
		// Declaring boolean to know if Arrays are equal
		boolean sonIguals = true;
		
		// Loop for if Arrays != boolean is false and exit 
		for (int i = 0; i < m1.length && sonIguals; i++) {
			if (m1[i]!=m2[i]) {
				sonIguals = false;
				
			}
		}
		
		// If Arrays equal or diff print...
		if (sonIguals == true) {
			System.out.println("Son iguals");
		} else {
			System.out.println("Son diferents");
		}
		
		
	}

}
