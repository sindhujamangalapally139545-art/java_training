public class name {
    public static void main(String[] args){
    
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter your first name: ");
        String first_name = input.next();

        System.out.println("Enter your last name: ");
        String last_name = input.next();
        String full_name = first_name+" " +last_name;

        System.out.println("Name is: "+full_name);

        input.close();
    }
    
}
