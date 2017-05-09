package challenge1;

public class sumForLoop {

	public static void main(String[] args) {
		
		//http://www.shiftedup.com/2015/05/07/five-programming-problems-every-software-engineer-should-be-able-to-solve-in-less-than-1-hour
		
		// Running a for loop to get the total of a list of numbers
		int Numbers[] = {1,2,3,4,5,6,7,8,9,10};
		int total = 0;
		
		for(int i = 0; i<Numbers.length;i++){
			total = total + Numbers[i];
		}
		
		
		System.out.println("For loop Total = " + total);
			

	}

}
