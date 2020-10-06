//primitive is faster
//wrapper class used in collection API,hibernate etc , framework

public class WrapperClass {
    public static void main(String[] args) {
        int i = 6;// primitive data type
        Integer ii = new Integer(6);// wrapper Integer for int,it is same as prev
        Integer j = new Integer(i);// wrapping-> primitive variable into an object , here prem is i, and obj is j

        int k = ii.intValue();// unwrapping ->as fetching the value of ii in k

        Integer v = i;// autowrapping,java will automatically fetch the value , we dont need .intValue
    }

}
