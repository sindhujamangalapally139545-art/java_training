public class switch_case {
    public static void main(String[] args){
        java.util.Scanner j = new java.util.Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a = j.nextInt();
    
        System.out.print("Enter the value of b : ");
        int b = j.nextInt();
        int ch;
        System.out.println("Enter your choice: ");
        System.out.println("1.Addition");
        System.out.println("2.subtraction");
        System.out.println("3.multiplication");
        System.out.println("4.division");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        ch = sc.nextInt();
        switch(ch){
            case 1:
                System.out.println("Addition: "+(a+b));
                break;
                case 2:
                System.out.println("Subtraction: "+(a-b));
                break;
                case 3:
                System.out.println("Multiplication: "+(a*b));
                break;
                case 4:
                System.out.println("Division: "+(a/b));
                break;
                default:
                    System.out.println("you are entered a wrong choice please check your choice");
        }
        j.close();
        sc.close();

    }
}
