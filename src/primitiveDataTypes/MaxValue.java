package primitiveDataTypes;

//Посчитайте Integer.MAX_VALUE + 1 и выведите результат.

public class MaxValue {
    public static void main(String[] args) {
        int n = Integer.MAX_VALUE + 1;
        System.out.println(n);
        System.out.println("Произошло переполнение!");
    }
}
