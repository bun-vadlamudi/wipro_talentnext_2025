
public class Arrays2 {
	public static void main(String[] args) {
		 

		        int[] num = {5, 12, 19, 3, 45};

		        int min = num[0];
		        int max = num[0];
		        for (int i = 1; i < num.length; i++) {
		            if (num[i] < min) min = num[i];
		            if (num[i] > max) max = num[i];
		        }

		        System.out.println("Minimum number of array is : " + min);
		        System.out.println("Maximum number of array is : " + max);
		    }
		
	}

