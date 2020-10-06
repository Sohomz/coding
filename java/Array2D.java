public class Array2D {
    public static void main(String[] args) {
        /*
         * a[]={1,2,3,4} b[]={2,3,6,8} c=[]={3,4,6,9} instead of doing this we can
         * create a 2D array in java
         */
        int d[][] = {

                { 1, 2, 3, 4 }, { 2, 3, 6, 8 }, { 3, 4, 6, 9 } };

        System.out.println(d[0][1]);

        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                System.out.print(d[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // enhanced for loop
        System.out.println("enhanced");
        for (int k[] : d) {
            for (int l : k) {
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }
}
