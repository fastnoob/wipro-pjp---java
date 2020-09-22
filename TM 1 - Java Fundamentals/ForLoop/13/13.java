class Main {
	public static int primeNumbers(int number) {
		int count=0;
		for(int i=2;i<=number;i++) {
			if(number%i==0) {
				count++;
			}
		}
		return count;
	}

	public static void main(String args[]) {
		int i;
		for(i=10;i<=99;i++) {
			if(primeNumbers(i)==1) {
				System.out.println(i);
			}
		}
	}
}