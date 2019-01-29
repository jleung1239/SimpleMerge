/**
 * Created by Teacher on 1/28/2019.
 * simpleMerge takes in two sorted arrays of
 * integers and merges them to return one sorted
 * array of integers.
 */
public class SimpleMerge {
    public static int[] simpleMerge(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length + arr2.length];
        int i;
        for (i = 0; i < arr1.length ; i++){
            arr[i] = arr1[i];
        }
        for (i = 0; i < arr2.length ; i++){
            arr[arr1.length + i] = arr2[i];
        }
        insertionSort(arr);
        return arr;
    }

    public static void insertionSort(int[] list1){
        //move the smallest int to the front, check it backwards following the (new) one that got swapped.
        // it checks backwards until it stops swapping. then it swaps the forward one again
        int temp;
        int swap;
        int i = 1; //next starting int
        int b; //keeps track of the swapped one
        while (i < list1.length){
            if (list1[i] < list1[i-1]){
                temp = list1[i-1];
                list1[i-1] = list1[i];
                list1[i] = temp;
                b = i-1;
                if (b > 0){
                    swap = 1; // you might need to fix this to condense some code
                    while ( swap > 0 && b > 0){
                        if (list1[b] < list1[b-1] ){
                            temp = list1[b];
                            list1[b] = list1[b-1];
                            list1[b-1] = temp;
                            b--;
                        }
                        else
                        {
                            swap = 0;
                        }
                    }
                }
            }
            i++;
        }

    }

}
