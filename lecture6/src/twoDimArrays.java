public class twoDimArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		System.out.println("String 2-dim array");
//		String[][] content = new String[4][4];
//		for (String[] arrayRow : content) {
//			System.out.println(Arrays.toString(arrayRow));
//		}
//		System.out.println("Setting value for each cell in  2-dim array");
//		for (int rowIndex = 0; rowIndex < content.length; rowIndex++) {
//			for (int colIndex = 0; colIndex < content[rowIndex].length; colIndex++) {
//				content[rowIndex][colIndex] = "hi";
//			}
//		}
//		for (String[] arrayRow : content) {
//			System.out.println(Arrays.toString(arrayRow));
		
//		int[][] twoDim = new int[4][4];
//		int u = 0;
//		for (int rowIndex = 0; rowIndex < twoDim.length; rowIndex++) {
//			System.out.println(Arrays.toString(twoDim[rowIndex]));
//			for (int colIndex = 0; colIndex < twoDim[rowIndex].length; colIndex++) {
//				twoDim[rowIndex][colIndex] = u++;
//			}
//		}
//		System.out.println("---------");
//		for (int[] arrayRow : twoDim) {
//			System.out.println(Arrays.toString(arrayRow));
//		int[][] dataSet = {
//			    {1,-5, 98,20},
//			    {3,-68,2},
//			    {7,29,0,-1,-68}
//			    
//			};
//		int smallest = dataSet[0][0];
//		
//		
//		
//		for (int i = 0; i < dataSet.length; i++){
//			int[] row = dataSet[i];
//			for (int j = 0; j < row.length; j++){
//				int cellValue = row[j];
//				sum = sum + cellValue;
//			}
//		}
//		System.out.println("Sum:" + sum);
		
		
		int[][] dataSet = new int[4][4];		int ordinal = 0;
		for (int i = 0; i < dataSet.length; i++) {
			int[] row = dataSet[i];
			for (int j = 0; j < row.length; j++) {
				row[j] = ordinal;
				ordinal++;
			}
		}		for(int[] row : dataSet){
			System.out.println(Arrays.toString(row));
		
		} 
		}}
	
