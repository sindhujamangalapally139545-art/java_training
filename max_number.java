public class max_number {
    public static void main(String[] args){
        java.util.Scanner j = new java.util.Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a = j.nextInt();
        System.out.print("Enter the value of b : ");
        int b = j.nextInt();
        System.out.print("Enter the value of c : ");
        int c = j.nextInt();
        int max;
        if (a>=b){
            if(a>=c){
                max = a;
            }else{
                max = c;
            }
        }else{
            if(b>=c){
                max = b;
            }
            else{
                max = c;
        }
    }
    System.out.println("Largest number is "+max);
    j.close();
}
}
