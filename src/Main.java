import java.util.*;
import java.lang.*;
import java.io.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {2,8,7,1,3,5,6,4};
        QuickSort quk = new QuickSort(arr);
        quk.quick_Sort(0,arr.length-1);

        for(int i : arr)
            System.out.print(i+" ");
    }
}