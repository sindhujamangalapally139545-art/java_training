public class blood_donation {
    public static void main(String[] args){
        int age;
        double weight;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        System.out.print("Enter your weight: ");
        weight = sc.nextDouble();
        if (age>=18){
            if (weight >=55){
                System.out.print("You are eligible to donate blood");
            }else{
                System.out.print("You are not eligible to donate blood");
            }
        }else{
            System.out.print("You are not eligible");
        }
        sc.close();
    }
}
