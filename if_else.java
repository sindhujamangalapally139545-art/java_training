public class if_else {
    public static void main(String[] args){
        int age;
        java.util.Scanner j = new java.util.Scanner(System.in);
        System.out.print("Enter your age : ");
        age = j.nextInt();
        if (age>80){
            System.out.print("You are very old");
        }else if (age>60){
            System.out.print("You are old");
        }else if(age>40){
            System.out.print("You are becoming old");
        }else if(age>20){
            System.out.print("You are young");
        }else{
            System.out.print("You are child");
        }
        j.close();
    }
}
