package java_fundamentals;

public class Fcontrol13 {
	public static void main(String[] args) {
		for (int num = 10; num <= 99; num++) {
			if (isPrime(num)) {
				System.out.println(num);
			}
		}
	}
	public static boolean isPrime(int n) {
		if (n <= 1) return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
