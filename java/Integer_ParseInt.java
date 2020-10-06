//as parseInt is a wrapper class so we have to  use Integer.parseInt,not only ParseInt 

public class Integer_ParseInt {
    public static void main(String[] args) {
        String v = "123";
        int n = Integer.parseInt(v);
        System.out.println(n);
    }
}
