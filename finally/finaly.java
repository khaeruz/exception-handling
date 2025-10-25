public class finaly {
    static int test() {
        try {
            System.out.println("di try");
            return 1;
        } finally {
            System.out.println("di finally (selalu dijalankan sebelum return)");
        }
    }

    public static void main(String[] args) {
        int v = test();
        System.out.println("nilai: " + v);
    }
}
