package cycles;

//Строка "Hello World". Используя for-each и методы String посчитать количество гласных (a,e,i,o,u).

public class CountingVowelsInALine {
    public static void main(String[] args) {
        String h = "Hello World";
        int count = 0;
        for (int i = 0; i < h.length(); i++) {
            String lower = h.toLowerCase();
            char ch = lower.charAt(i);
            if (ch == 'e' || ch == 'o') {
                count++;
            }
        }System.out.println(count);
    }
}
