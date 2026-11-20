public class voting {
    public static void main(String[] args){
        int age;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        if(age>=18){
            System.out.println("you are eligible");
        }else{
            System.out.println("you are not eligible");
        }
        sc.close();
    }
}
