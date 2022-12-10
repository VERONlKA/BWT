public class Task1 {

    public static void main(String[] args) {
        int[] numb = {3, 5, 9, 10, 4, 2, 34, 78, 21, 90, 29};
        findMax(numb);

    }
    public static void findMax(int[] a){
        int max = 0;
        for(int i = 0; i < a.length-1; i++){
            if(max < a[i]){
                max = a[i];
            }
        }
        System.out.println("Max element: "+max);
    }
}


