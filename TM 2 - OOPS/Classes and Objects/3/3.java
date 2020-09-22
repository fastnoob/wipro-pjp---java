
class Patient {
	String n;
	double h,w;

	Patient(String patientName,double height,double weight) {
		n=patientName;
		h=height;
		w=weight;
	}
	double computeBMI() {
		return w/(h*h);
	}

	public static void main(String args[]) {
		Patient bmi = new Patient("Shayan",5,75);
		System.out.println(bmi.computeBMI());
	}
}