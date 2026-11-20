public class movie_ticket {
    public static void main(String[] args){
        int age;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        boolean hasStudentId = true;
        if(age<12){
            System.out.println("child ticket : $5.00");
        }else if (age >= 65){
            System.out.println("senior ticket : $7.00");
        }else{
            if (hasStudentId && age <= 30){
                System.out.println("Student Discont ticket : $8.50");
            }else{
                System.out.println("Standard Discont ticket : $12.00");
            }
        }
        sc.close();
    }
}
