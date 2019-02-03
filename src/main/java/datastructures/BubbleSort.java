package datastructures;

public class BubbleSort {
    public static void main(String args[]){
        int a[] = {10,5,20,30,1,15,3};

        int n = a.length;

        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                if(a[j-1]>a[j]){
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;

                }
            }
        }

        for(int b:a)
        System.out.println(b);
    }
}
