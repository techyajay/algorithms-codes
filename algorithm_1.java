class Prime {
	public static boolean isPrime(int x) {
		boolean prime = true;
		for(int i=2; i<x; i++) {
			if ((x%i) == 0)
				prime = false;
		}
		return prime
	}

	public static void main(Strings[] args) {
		int count = 0;
		int number = 2;
		while (count < 10000) {
			if (isPrime(number)) {
				System.out.println(number);
				count++;
			}
			number++;
		}
	}
}