import java.util.Arrays;

class Project1 {
    public static String[] empCol = {"empNo","empName","doj","desigCode","dept","BASIC","HRA","IT"};
    public static String[][] empTable = {
        {"1001", "Ashish", "01/04/2009", "e", "R&D", "20000", "8000", "3000"},
		{"1002", "Sushma", "23/08/2012", "c", "PM", "30000", "12000", "9000"},
		{"1003", "Rahul", "12/11/2008", "k", "Acct", "10000", "8000", "1000"},
		{"1004", "Chahat", "29/01/2013", "r", "FrontDesk", "12000", "6000", "2000"},
		{"1005", "Ranjan", "16/07/2005", "m", "Engg", "50000", "20000", "20000"},
		{"1006", "Suman", "1/1/2000", "e", "Manufacturing", "23000", "9000", "4400"},
		{"1007", "Tanmay", "12/06/2006", "c", "PM", "29000", "12000", "10000"}
    };
    public static String[] daCol = {"desigCode","desig","DA"};
    public static String[][] daTable = {
        {"e", "Engineer", "20000"},
		{"c", "Consultant", "32000"},
		{"k", "Clerk", "12000"},
		{"r", "Receptionist", "15000"},
		{"m", "Manager", "40000"}
    };

    public static void main(String args[]) {
        int id = Integer.parseInt(args[0]);
        String[] employeeData = new String[empTable[0].length];
        int totalRow = empTable.length;
        if(id>=Integer.parseInt(empTable[0][0]) && id<=Integer.parseInt(empTable[(totalRow-1)][0])) {
            for(int i=0;i<totalRow;i++) {
                if(id==Integer.parseInt(empTable[i][0])){
                    for(int j=0;j<empTable[0].length;j++) {
                        employeeData[j]=empTable[i][j];
                    }
                }
            }
            String designationCode = employeeData[Arrays.asList(empCol).indexOf("desigCode")];
		    String[] da = new String[daTable[0].length];
			for (int i=0;i<daTable.length;i++) {
			if (designationCode.equals(daTable[i][0])) {
				for (int j=0;j<daTable[0].length;j++) {
					da[j] = daTable[i][j];
				}
			}
        }	
            int daAmt = Integer.parseInt(da[Arrays.asList(daCol).indexOf("DA")]);
            int basicAmt = Integer.parseInt(employeeData[Arrays.asList(empCol).indexOf("BASIC")]);
            int hraAmt = Integer.parseInt(employeeData[Arrays.asList(empCol).indexOf("HRA")]);
            int itAmt = Integer.parseInt(employeeData[Arrays.asList(empCol).indexOf("IT")]);
            int salary = basicAmt + hraAmt + daAmt - itAmt;
            
            String designation = da[Arrays.asList(daCol).indexOf("desig")];

            System.out.printf("%-10s%-10s%-15s%-15s%-10s\n", "Emp No", "Emp Name", "Department", "Designation", "Salary");
			System.out.println();
			System.out.printf("%-10s%-10s%-15s%-15s%-10s", employeeData[0], employeeData[1], employeeData[4], designation, salary);
        }
        else {
            System.out.println("There is no employee with empid : "+args[0]);
        }
    }
}