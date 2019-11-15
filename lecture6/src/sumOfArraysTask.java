
public class sumOfArraysTask {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] myArray = {1, -3, 44, -39};
		int sum = 0;
		for (int i =0; i< myArray.length; i++){
			sum = sum + myArray[i];
			System.out.println("sum:" + sum);
		}

	}

}
