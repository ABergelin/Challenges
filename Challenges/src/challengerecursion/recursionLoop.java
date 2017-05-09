package challengerecursion;

public class recursionLoop {

	public static void main(String[] args) {
		// Getting the sum of an array via recursion
		
		int Numbers[] = {1,2,3,4,5,6,7,8,9,10};
		int i = 0;
		int total = 0;
		
		total = recursiveAdd(Numbers, i);
		
		System.out.println("Recursion total = " + total);

	}
	
	static int recursiveAdd(int numberArray[], int index){
				
		
		System.out.println(numberArray[index]);
		
		if (index < numberArray.length - 1){
			return recursiveAdd(numberArray, index+1) + numberArray[index];
		} else {
			return numberArray[index];
		}
			
		
	}
	
	
	

}
