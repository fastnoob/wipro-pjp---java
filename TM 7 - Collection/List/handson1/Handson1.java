import java.util.ArrayList;

class Handson1 {
	public static void main(String[] args){
		ArrayList months = new ArrayList();
		months.add("January");
		months.add("February");
		months.add("March");
		months.add("April");
		months.add("May");
		months.add("June");
		months.add("July");
		months.add("August");
		months.add("September");
		months.add("October");
		months.add("November");
		months.add("December");

		System.out.println("MONTHS' NAME");
		System.out.println("------------");
		for(int i=0;i<months.size();i++){
			System.out.println(months.get(i));
		}
	}
}