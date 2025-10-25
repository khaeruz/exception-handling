package trow;

public class trow {
     static void cekUmur(int umur) {
        if (umur < 18) {
            throw new IllegalArgumentException("Umur harus >= 20, diberikan: " + umur);
        }
    }

    public static void main(String[] args) {
        try {
            cekUmur(17);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
