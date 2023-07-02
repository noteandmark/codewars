package tasks_6_level.task32_equalsidesofanarray;

public class Kata {
	public static int findEvenIndex(int[] arr) {
		int sumLeft = 0;
		int sumRight = 0;
		
        if (arr == null) {
            return -1;
        }
        
        if (arr.length-1 == 1 && arr[0] == 0) {
            return 1;
        }
        
        if (arr.length-1 == 0) {
            return 0;
        }
        
		for (int n = 0; n < arr.length - 1; n++) {
			
			for (int i = 0; i < n; i++) {
				sumLeft = sumLeft+arr[i];
			}
			for (int j = n + 1; j < arr.length; j++) {
				sumRight = sumRight+arr[j];
			}
			if (sumLeft == sumRight) {
				return n;
			}
			sumLeft = 0;
			sumRight = 0;
		}

		return -1;
	}
}
