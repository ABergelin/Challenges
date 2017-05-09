package challenge1;

public class sumForLoop {

	public static void main(String[] args) {
		
		// Running a for loop to get the total of a list of numbers
		int Numbers[] = {1,2,3,4,5,6,7,8,9,10};
		int total = 0;
		
		for(int i = 0; i<Numbers.length;i++){
			total = total + Numbers[i];
		}
		
		
		System.out.println("For loop Total = " + total);
			

	}

}
