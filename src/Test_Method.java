public class Test_Method {

    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int l = 7;
        int m = 9;
        int c = summa(a, b);
        int k = summa(l, m);
        System.out.println("Сумма чисел a и b равна " + c);
        System.out.println("Сумма чисел l и m равна " + k);
    }

    public static int summa(int a, int b) {
        int c = a + b;
        return c;
       }
}
