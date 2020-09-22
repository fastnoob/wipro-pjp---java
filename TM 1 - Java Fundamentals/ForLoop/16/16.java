class Main {
	public static void main(String args[]) {
		int noOfRows;
		int row,column;

		if (args.length>0) {
			noOfRows = Integer.parseInt(args[0]);	
			for(row=1;row<=noOfRows;row++) {
				for(column=1;column<=row;column++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}
		else {
			System.out.println("Please enter an integer");
		}
	}
}