public class Except1 {
    public static void main(String[] args) {
        try {
            int i = 9 / 0;
        } catch (Exception e) {
            System.out.println("error");
        } finally {
            System.err.println("Bye");// err is error

        }

    }

}
