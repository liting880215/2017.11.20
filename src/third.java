public class third {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        Integer i,b;

        for(b=1;b<=5;b++){
            for(i=5;i>=b;i--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
