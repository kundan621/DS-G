package sorting;

public class SelectionSort {
    public static void main(String[] args) {

        int arr[] = { 2,3,1,5,8 };
        SelectionSort sort=new SelectionSort();
        sort.sort(arr);
        for (int num:arr) {
            System.out.println(num);
        }

    }

    private void sort(int[] arr) {

        for(int i=0;i<arr.length-1;i++) {
            int min=arr[i];
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < min) {
                     minIndex=j;
                     min=arr[j];
                }


            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
    }
}
