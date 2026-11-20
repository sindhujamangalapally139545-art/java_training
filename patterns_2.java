public class patterns_2 {
    public static void main(String[] args){
        int i;
        for(i = 10; i >= 1; i--){
            if(i % 2 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
