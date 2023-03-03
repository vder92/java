public class cycleFor {
    public static void main(String[] args) {
        int a = 100;
        int b = 1;
        int c = 0;

        for (int i = a; i >= b; i--) {
            if (function(i) == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static int function(int i) {
        int c = i % 4;
        return c;
    }
}
