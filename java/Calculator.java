class Calc {
    int num1;
    int num2;
    int result;

    public void perform() {
        result = num1 + num2;
    }
}

public class Calculator {
    public static void main(String[] args) {// String because string accepts all data types,args[]because in class there
                                            // are many value assigned int,float , so we take an array type string
        Calc obj = new Calc();// creating an obj , memory space
        obj.num1 = 2;// we acnt access just bu num1 ,num2,because this is not assigned here
        obj.num2 = 10;// so we have to use obj. to use that class method

        System.out.println(obj.result);// this results 0,in c garbadge , but in java garbage collector
        obj.perform();
        System.out.println(obj.result);
    }

}
