
public class multicatch {
     public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length()); 
        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println("NPE atau AIOOB terjadi: " + e);
        } catch (Exception e) {
            System.out.println("Exception umum: " + e);
        }
    }
}
