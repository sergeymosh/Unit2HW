public class Unit2Task1 {
    public static void main(String[] args) {
        double distance = 10;
        double sum = distance;
        for(int day = 2;day <= 7; day++){
            distance *= 1.1;
            sum = distance + sum;
        }
        System.out.println("Суммарно спортсмен пробежит: " + sum);
    }
}
