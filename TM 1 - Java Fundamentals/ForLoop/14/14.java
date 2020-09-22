class Main {
	public static void main(String args[]) {
		int number;
		int count = 0;
		
if(args.length>0) {

		number=Integer.parseInt(args[0]);

		if(number>1) {
		for(int i=2;i<=number;i++) {
			if(number%i==0) {
				count++;
			}
		}
		if(count==1) {
			System.out.println(number + " is prime number");
		}
		else {
			System.out.println(number + " is a composite number");
			}
		}

		else if(number==0) {
			System.out.println("0 is neither prime nor composite");
		}

		else if(number==1) {
			System.out.println("1 is neither prime nor composite");
		}
	}
	else if(args.length==0) {
		System.out.println("Please enter an integer number");
	}
}
}