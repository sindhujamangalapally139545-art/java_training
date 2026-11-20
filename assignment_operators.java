public class assignment_operators {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter a: ");
        int a = input.nextInt();

        System.out.println("Enter b: ");
        int b = input.nextInt();
        b += a;

        System.out.println("Enter c: ");
        int c = input.nextInt();
        c -= a;

        System.out.println("Enter d: ");
        int d = input.nextInt();
        d *= a;

        System.out.println("a: " + a);
        System.out.println("add: " + b);
        System.out.println("sub: " + c);
        System.out.println("mult: " + d);

        input.close();
    }
}