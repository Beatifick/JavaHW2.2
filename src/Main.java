public class Main {
    public static void main(String[] args) {

        int wallet = 100;
        int refill = 2200;
        int bonus;

        if (refill >= 1000) {
            bonus = refill / 100;
                System.out.println("Полученный бонус = " + bonus);
            System.out.println("В кошельке: " + (wallet + refill + bonus));
        } else {
            bonus = 0;
            System.out.println("В кошельке: " + (wallet + refill));
        }

    }
}