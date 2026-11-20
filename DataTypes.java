import java.util.Scanner;
public class DataTypes {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String var_1 = Input.next();
        System.out.print("Enter your age : ");
        int var_2 = Input.nextInt();
        System.out.print("Enter your enrollment number:");
        long var_3 = Input.nextLong();
        System.out.print("Enter your attendance:");
        float var_4 = Input.nextFloat();
        System.out.print("Enter the current semester:");
        byte var_5 = Input.nextByte();

        
        
        System.out.println("Student Name is : " + var_1);
        System.out.println("Age : " + var_2);
        System.out.println("Enrollment Number : " + var_3);
        System.out.println("Attendence : " + var_4);
        System.out.println("Semester : " + var_5);

        Input.close();


    }
}