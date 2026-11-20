import java.util.Scanner;

public class student_name {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.next();

        System.out.println("you are form which dept: ");
        String dept = sc.nextLine();

        System.out.println("iam "+name+ " and iam from "+dept);
        sc.close();
    }
}
