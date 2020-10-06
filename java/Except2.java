import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Except2 {// if we dont use throw use try cath , two types 1.throws 2.try catch
    public static void main(String[] args) throws Exception {
        int n = 0;
        System.out.println("Enter a number");
        BufferedReader br = null;

        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            n = Integer.parseInt(br.readLine());
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            br.close();
        }
        System.out.println(n);

    }

}
