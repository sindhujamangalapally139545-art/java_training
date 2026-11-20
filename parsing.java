public class parsing {
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter the value here: ");
        String text = sc.nextLine();
        int number = Integer.parseInt(text);
        System.out.println("This you converted value: "+number);
        sc.close();
    }
}