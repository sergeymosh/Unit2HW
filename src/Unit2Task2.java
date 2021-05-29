public class Unit2Task2 {

    public static void main(String[] args) {
        int hour = 24;
        int amebs = 1;
        for(int i = 1; i <= hour / 3; i++){
            amebs*=2;
        }
        System.out.println("Через 24 часа будет - " + amebs);
    }

}