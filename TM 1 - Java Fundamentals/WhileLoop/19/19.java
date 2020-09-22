class Main {
	public static void main(String args[]) {
		int i=1;
		int count=0;
			while(count<5 && i<500) {
				if (i%2==0 && i%3==0 && i%5==0) {
					System.out.println(i);
					count++;
					i++;
				}
				else {
					i++;
				}	
			}
		}
	}