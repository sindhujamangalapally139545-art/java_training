public class pre_and_post_operator {
    public static void main(String[] args){
        // this is about post increment operator
        int a = 10;
        System.out.println("The value of a is "+a);
        System.out.println("post incremented "+a++);
        System.out.println("After post increment the value of a is "+ a);

        int j = 23;
        System.out.println("The value of j is "+j);
        System.out.println("post decrement "+j--);
        System.out.println("After post decrement the value of j is "+ j);

        System.out.println();

        //this is about pre increment operator
        int b = 0;
        System.out.println("The value of b is "+b);
        System.out.println("pre increment "+ ++b);
        System.out.println("After the pre increment "+b);

        System.out.println("pre decrement "+--b);
    }
}
