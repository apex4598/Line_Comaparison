package Line_Comparision;
import EmployeeWage.EmpWages;
import java.sql.SQLOutput;
import java.util.Scanner;

public class LineComparision {
    public double x1, x2, y1, y2, length;
    public void calculateLength()
    {

        System.out.println("****Calutating Legth****");
        System.out.println("Enter the value of x1 : ");
        //System.out.println("x1:"+x1);
        Scanner sc=new Scanner(System.in);
        x1=sc.nextInt();
        System.out.println("Enter the value of y1 : ");
        y1=sc.nextInt();
        System.out.println("Enter the value of x2: ");
        x2=sc.nextInt();
        System.out.println("Enter the value of y2 : ");
        y2=sc.nextInt();

        length=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.println("Length of line is :" +length);
    }
    public static void main(String args[])
    {
        LineComparision ls=new LineComparision();
        ls.calculateLength();
    }
}
