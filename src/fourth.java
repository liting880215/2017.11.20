public class fourth {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        Integer i,a;

        for(a=2;a<=9;a++){
            for(i=1;i<=9;i++){
                System.out.printf("%d*%d=%d",a,i,2*i);
                System.out.print("\n");
            }
        }
    }
}
