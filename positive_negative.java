public class positive_negative {
    public static void main(String[] args){
        int num;
        java.util.Scanner j = new java.util.Scanner(System.in);
        System.out.print("Enter an integer : ");
        num = j.nextInt();
        if (num>0){
            System.out.println("Positive number");
        }else{
            System.out.println("negative number");
        }
        j.close();
    }
}
