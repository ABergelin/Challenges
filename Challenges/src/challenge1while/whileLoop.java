package challenge1while;

public class whileLoop {

	public static void main(String[] args) {
		// Running a while loop to total a list of numbers
		
		int Numbers[] = {1,2,3,4,5,6,7,8,9,10};
		int total = 0;
		int i = 0;
		
		while(i < Numbers.length){
			total = total + Numbers[i];
			i++;
		}
		
		
		System.out.println("while loop Total = " + total);

	}

}
