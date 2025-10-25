package trows;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class trows {
     
    static String bacaBarisPertama(String path) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        }
    }

    public static void main(String[] args) {
        try {
            String result = bacaBarisPertama("nofile.txt");
            System.out.println(result);
        } catch (IOException e) {
            System.out.println("Gagal membaca file: " + e.getMessage());
        }
    }
}
