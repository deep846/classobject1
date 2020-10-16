import java.util.Scanner;

class student
{
    private int roll;
    private String name;
    private float per;
    private Scanner sc=new Scanner(System.in);
    
    public void input()
    {
        System.out.print("Roll: ");
        roll=sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        name=sc.nextLine();
        System.out.print("Percentage: ");
        per=sc.nextFloat();
    }
    
    public void display()
    {
        System.out.println("Roll: "+roll);
        System.out.println("Name: "+name);
        System.out.println("Per%: "+per);
    }
}

public class classobject1
{
    public static void main(String args[])
    {
        student x=new student();
        x.input();
        x.display();
        
        
    }
}
