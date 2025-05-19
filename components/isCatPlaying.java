public class Main {

    // Kedinin oyun oynayıp oynamadığını kontrol eden metod
    public static boolean isCatPlaying(boolean isSummer, int temperature) {
        int upperLimit = isSummer ? 45 : 35; // Eğer yazsa üst limit 45, değilse 35

        // Sıcaklık 25 ile üst limit arasında ise kedi oyun oynuyor demektir
        if (temperature >= 25 && temperature <= upperLimit) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // Örnek testler
        System.out.println(isCatPlaying(true, 10));   // false (Yaz ama sıcaklık çok düşük)
        System.out.println(isCatPlaying(false, 36));  // false (Yaz değil ve sıcaklık üst limitin üstünde)
        System.out.println(isCatPlaying(false, 35));  // true (Yaz değil ve sıcaklık tam sınırda)
        System.out.println(isCatPlaying(true, 40));   // true (Yaz ve sıcaklık 45'in altında)
        System.out.println(isCatPlaying(false, 25));  // true (Yaz değil ve sıcaklık alt sınırda)
    }
}
