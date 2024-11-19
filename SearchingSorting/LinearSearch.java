package SearchingSorting;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        System.out.print("Please enter the size of the array : ");
        Scanner in=new Scanner(System.in);
        int size=in.nextInt();
        int arr[]=new int[size];

        System.out.println("Enter the elements ");
        for(int j=0;j<size;j++){
            arr[j]=in.nextInt();
        }
        System.out.println("Please enter the target");
        int target=in.nextInt();
        System.out.print("Target is at index: ");
        System.out.println(LinearSearch.searchElement(arr,target));

    }

    public static int searchElement(int arr[] ,int target){
        for(int i=0;i< arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;

    }
}
