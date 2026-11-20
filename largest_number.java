public class largest_number {
    public static void main(String[] args){
        java.util.Scanner j = new java.util.Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a = j.nextInt();
        System.out.print("Enter the value of b : ");
        int b = j.nextInt();
        System.out.print("Enter the value of c : ");
        int c = j.nextInt();
        if (a>=b){
            if (a>=c){
                System.out.println("lagrest number is "+a);
            }
            else{
                System.out.println("lagrest number is "+c);
            }
        }else{
            if(b>=c){
                System.out.println("lagrest number is "+b);
            }else{
                System.out.println("lagrest number is "+c);
            }
        }
        j.close();
    }
}

