package mergesort;
import java.util.Scanner;
/*
  @author Abhishek
*/
public class MergeSort {
    public static void sort(int a[], int high, int low){
        int N = high - low; //Size of the resultant array
        //Check if the size of the array is more than 1 element
        if(N<=1)
            return; //Stop the function if the array only has 1 or no elements
        int mid = low + N/2; //Finding the mid point 
        //Calling sort recursively in itself
        sort(a, low, mid); //Calling from low to mid (1st Subarray)
        sort(a, mid, high); //Calling from mid to high {2nd Subarray}
        int[] temp = new int[N];//Create a temporary array to store sorts of size N
        int i = low, j = mid; //Reassigning variables to check for conditions
        //Recursively loop through the orginal array(a), of size N, to check for 3 conditions
        for(int k =0; k<N; k++){
            //Check if the low point and mid point are the same
            if(i == mid){
                temp[k] = a[j++];
            }
            //Check if the mid point and high point are the same
            else if(j == high){
                temp[k] = a[i++];
            }//Check if element from 2nd array is smaller than element from 1st array
            else if(a[j]<a[i]){
                temp[k] = a[j++];
            }//Check if element from 1st array is smaller than element from 2nd array
            else{
                temp[k] = a[i++];
            }
            //I dont know what is this loop for
            for(k = 0; k<N; k++){
                a[low + k] = temp[k]; //I dont know what does this do
            }
        }
        
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, i;
        System.out.println("Enter the size of the array");
        n = s.nextInt();
        int arr[] = new int[n]; //Creating an empty array of size taken from the user
        System.out.println("Enter the elements");
        //Recursively taking in all the numbers and populating the array
        for(i=0; i<n; i++){
            arr[i] = s.nextInt();
        }
        sort(arr,0,n);//Calling the SORT fucntion
        System.out.println("Elements after sorting");
        for(i=0; i<n; i++){
            System.out.println(arr[i]+" ");
        }
    }
}
