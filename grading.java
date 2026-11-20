public class grading {
    public static void main(String[] args){
        int marks;
        java.util.Scanner j = new java.util.Scanner(System.in);
        System.out.print("Enter your marks: ");
        marks = j.nextInt();
        if (marks >= 80){
            System.out.print("A grade");
        }else if (marks >= 60 && marks < 80){
            System.out.print("B grade");
        }else if(marks >= 40 && marks < 60){
            System.out.print("C grade");
        }else{
            System.out.print("Fail");
        }
        j.close();
    }
}