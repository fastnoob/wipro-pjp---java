import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();    
        StringBuffer finalString = new StringBuffer("");
        int length1 = str1.length();
        for(int i=0; i<length1; i++) {
            boolean flag = true;
            int length2 = str2.length(), j, k;
            for(j=0, k=i; j<length2 && k<length1; j++,k++) {
                if(str2.charAt(j)!=str1.charAt(k)) {
                    flag = false;
                    break;
                }
            }
            if(j==length2 && flag) {
                if((i-1)>=0){
                    finalString.append(str1.charAt(i-1));
                }
                if(i+length2+1 < length1){
                    finalString.append(str1.charAt(i+length2));
                }
                i+=(length2);
            }
        }
        System.out.println(finalString);
    }
}

    