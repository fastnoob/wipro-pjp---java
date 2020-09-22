class Main {
	public static void main(String args[]) {
		if(args.length==0) {
			System.out.println("No values");
		}
		else {
			for(String x : args) {
				System.out.print(x);
				System.out.print(",");
			}
		}
	}
}