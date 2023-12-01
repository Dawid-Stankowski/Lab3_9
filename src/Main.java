public class Main {
    //Czy jest parzysta
    public static boolean czyParzysta(int liczba) {
        return liczba % 2 == 0;
    }
    // Czy jest dodatnia
    public static boolean czyDodatnia(int liczba) {
        return liczba > 0;
    }
    public static void main(String[] args) {
        // Przykładowa liczba
        int pLiczba = 10;

        if (czyParzysta(pLiczba) && czyDodatnia(pLiczba)) {
            System.out.println("Liczba jest parzysta i dodatnia.");
        } else if (czyParzysta(pLiczba)) {
            System.out.println("Liczba jest parzysta, ale nie jest dodatnia.");
        } else if (czyDodatnia(pLiczba)) {
            System.out.println("Liczba nie jest parzysta, ale jest dodatnia.");
        } else {
            System.out.println("Liczba nie jest ani parzysta, ani dodatnia.");
        }
    }
}