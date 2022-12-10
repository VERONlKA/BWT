public class Task2 {
    public static void main(String[] args) {
    double numb[] = {1.5, 3.7, 8, 9, 2, 56, 90, 3.59};
    bubbleSort(numb);
    }

    public static void bubbleSort (double[] a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < (a.length - i); j++) {
                if (a[j - 1] > a[j]) {
                    swap(a,j-1, j);

                }
            }

        }
        show(a);
    }
    static void swap(double [] A, int a, int b){

        double temp = A[a];
        A[a] = A[b];
        A[b] = temp;
    }
    static void show (double[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " " );
        }
    }
}
