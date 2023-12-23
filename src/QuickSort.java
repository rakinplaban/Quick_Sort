public class QuickSort {
    private int p,r,q,temp;
    private int[] arr;
    public QuickSort(int[] arr){
        this.arr = arr;
    }

    private void swap(int a,int b){
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public void quick_Sort(int p, int r){
        if (p<r) {
            q = partition(p, r);

            quick_Sort(p, q - 1);
            quick_Sort(q + 1, r);
            //return arr;
        }
        //return arr;
    }

    private int partition(int p,int r){
        int x = arr[r];
        int i = p-1;
        for(int j=p; j<r; j++){
            if(arr[j]<=x){
                i = i+1;
                swap(i,j);
            }
        }
        swap(i+1,r);
        return i+1;
    }
}
