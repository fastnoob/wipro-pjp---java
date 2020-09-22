import java.util.Scanner;

class NegativeValuesException extends Exception {
	public NegativeValuesException() {
		super();
		System.out.println("NegativeValuesException occured");
	}
}

class ValuesOutOfRangeException extends Exception {
	public ValuesOutOfRangeException() {
		super();
		System.out.println("ValuesOutOfRangeException occured");
	}
}

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			for (int i=0;i<2;i++) {
			String name="";
			int subject1=0, subject2=0,subject3=0;
			try {			
				System.out.print("Enter the name of student : ");	
				name = sc.nextLine();
				if (sc.hasNextInt())
					subject1 = sc.nextInt();
				else
					throw new NumberFormatException();		
				if (sc.hasNextInt())
					subject2 = sc.nextInt();
				else
					throw new NumberFormatException();
				if (sc.hasNextInt())
					subject3 = sc.nextInt();
				else
					throw new NumberFormatException();			
				if (subject1 < 0) throw new NegativeValuesException();
				if (subject1 > 100) throw new ValuesOutOfRangeException();
				if (subject2 < 0) throw new NegativeValuesException();
				if (subject2 > 100) throw new ValuesOutOfRangeException();
				if (subject3 < 0) throw new NegativeValuesException();
				if (subject3 > 100) throw new ValuesOutOfRangeException();
				
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			} catch (NegativeValuesException e) {
				System.out.println(e.getMessage());
			} catch (ValuesOutOfRangeException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Name of the student : " + name);
			System.out.println("Marks of subject 1 : " + subject1);
			System.out.println("Marks of subject 2 : " + subject2);
			System.out.println("Marks of subject 3 : " + subject3);
		}
	}
}
