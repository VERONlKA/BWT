public class Task4 {
    public static void main(String[] args) {
        int[] numb = {2, 6, 15, 30, 60, 71};
        int res = binarySearch(numb, 0, numb.length-1, 60);
        if (res == -1){
            System.out.println("Такого елемента немає");
        } else {
            System.out.println("Номер елемента "+ res);
        }

    }
    public static int binarySearch (int a[], int left, int right, int x){
      if (right >= left) {
          int middle = left + (right - left) / 2;

          if (a[middle] == x) {
              return middle;
          }

          if (a[middle] > x) {
              return binarySearch(a, left, middle - 1, x);

          }
          return binarySearch(a, middle + 1, right, x);

      }
      return -1;
  }
}
