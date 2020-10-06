
public class Excpt3 {
    public static void main(String[] args) {
        int i, j;
        i = 8;
        j = 9;
        try {
            int k = i / j;
            if (k == 0) {
                throw new UserException("this is not possible");// parameterized cons at extends at public
                // UserException(String s)
            }
            System.out.println(k);
        } catch (UserException u) {
            System.out.println("its user exception" + u.getMessage());
        }
    }

}

class UserException extends Exception {
    public UserException(String s) {
        super(s);
    }
}
