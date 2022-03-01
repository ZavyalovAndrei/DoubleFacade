public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println("Выведем сумму двоичных чисел 1010 и 11:");
        String a = "1010";
        String b = "11";
        System.out.println(bins.sum(a, b));
        System.out.println("Выведем произведение двоичного числа 11011 и 10101:");
        a = "11011";
        b = "10101";
        System.out.println(bins.mult(a, b));
    }
}
