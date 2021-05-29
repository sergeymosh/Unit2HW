public class Unit2Task3 {
    public static void main(String[] args) {
        int pow = 1;
        int sum = 0;
        for(int i = 1; i <= 9; i++ ){
            System.out.print(pow + " ");
            sum = pow + sum;
            pow *= 2;

        }
        System.out.println();
        System.out.println(sum);
    }
}
