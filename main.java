public class main {
	public static void main(String[] args) {
		// Define variables

		int[] nums = {2,3,4};
		int[] queries = {0,2,2};
		
		int[][] numsPairings = new int[100][2];

		int pairCount = 0; // defines the row index in the 2D array where each pair of nums should be placed in

		// Create every combination of nums

		for (int indexI = 0; indexI < nums.length; indexI++) {
			for (int indexJ = indexI + 1; indexJ < nums.length; indexJ++) {
				numsPairings[pairCount][0] = indexI;
				numsPairings[pairCount][1] = indexJ;

				pairCount++;
			}
		}

		for (int row = 0; row < numsPairings.length; row++) {
			for (int column = 0; column < numsPairings[row].length; column++) {
				System.out.println(numsPairings[row][column]);
			}
		}
		
	}
}
