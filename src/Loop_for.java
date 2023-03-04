public class Loop_for {
    public static void main(String[] args) {

        for (int i = 100; i >= 1; i--) {
            if (evenCheck(i) == 0) {
                System.out.print(i + " ");
            }
        }
    }
    public static int evenCheck(int i) {
        return i % 4;
    }
}
