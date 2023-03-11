public class LoopFor {
    public static void main(String[] args) {

        for (int i = 100; i >= 1; i--) {
            if (evenCheck(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean evenCheck(int i) {
        return i % 4 == 0;
    }
}
