package insertion;
import java.util.Scanner;

/*
    @author Abhishek
 */
public class Insertion {
    //Insertion sort Main Function
    public static void insertionSort(int[] a){
        for(int i = 1; i<a.length; i++){
            int key = a[i]; //Element after 0th index
            int j = i-1; //Element before the key, to compare the key with
            //J is the index of the element KEY is being compared to
            //Check if the index is 0 or above, -1 is out of bounds
            //If the element is larger than key, enter the while loop
            while((j>-1) && (a[j]>key)){
                a[j+1] = a[j]; //Swap the value of J with the current KEY
                j--; //I don't know why but at the time of taking input, it enters infinite loop
            }
            a[j+1] = key; //If the key is larger than J, make the next element the key and move on
        }
        //Print the solution
        for(int n=0; n<a.length; n++)
            System.out.print(a[n]+" "); //Printing recursive output to the screen
        //Analyze the time taken
        double time = a.length*(a.length-1)/2; //Fixed formula
        System.out.println();//Adding a blank line to make it look good
        System.out.println("Running time: " + time + " units"); //Printing the running time calulated        
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array size");
        int a = s.nextInt();
        int[] input = new int[a];
        System.out.println("Enter the elements");
        for(int i = 0; i < a; i++)
            input[i] = s.nextInt();
        insertionSort(input); //Provide the same user array as input to both parameters
    }
    
}
