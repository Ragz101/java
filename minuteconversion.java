import java.util.*;
public class minuteconversion{
    public static void main(String[] args) {
        int year,month, week, day, hour, rem1;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter minutes: ");
        int val= input.nextInt();
        System.out.println("Value Entered: " + val);
        year = val/525600;
        rem1 = val%525600;
        month = rem1/43800;
        rem1= rem1%43800;
        week= rem1/10080;
        rem1=rem1%10080;
        day= rem1/1440;
        rem1=rem1%1440;
        hour= rem1/60;
      
        
        System.out.println("YEAR(s) " + year);
        System.out.println("MONTH(s) " + month);
        System.out.println("WEEK(s) " + week);
        System.out.println("DAY(s) " + day);
        System.out.println("HOUR(s) " + hour);
        input.close();

        
    }
    
}