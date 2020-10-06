public class Array1D {
    public static void main(String[] args) {
        int a[] = new int[4];
        // int a[]={10,20,30,40};
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;

        for (int i = 0; i < 4; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        // enhanced for loop
        System.out.println("enhanced");
        for (int k : a) {
            System.out.print(k + " ");
        }
        System.out.println();
    }
}
