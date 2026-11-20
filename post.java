public class post {
    int a = 10;
    public static void main(String[] args){
       post ref = new post();

        System.out.println(ref.a);
        System.out.println(ref.a++);
        System.out.println(ref.a);

        System.out.println();

        int var = 10;
        System.out.println(var);
        System.out.println(--var);
        System.out.println(!(var > ref.a));
    }
}
