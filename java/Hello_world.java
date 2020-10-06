class Hello_world {
  public static void main(String[] args) {
    System.out.println("Hello, World!");
    double d = 7;// implicit type castintg,double can store int
    // int k = (int)5.6;// explicit type casting
    // byte<short,char<int<long<float<double
    // System.out.println(k);

    int m = 4, n = 5;
    int temp = ++n;// preinc , first inc value,then assign, so n=6
    int temp1 = m++;// post , first assign the value the inc so m=4
    System.out.println(temp);
    System.out.println(temp1);

    int i, j, p = 4;
    for (i = 1; i <= p; i++) {
      for (j = 1; j <= i; j++) {
        System.out.print('*');
      }
      System.out.println();
    }

  }
}
