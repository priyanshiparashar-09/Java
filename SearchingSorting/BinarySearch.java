package SearchingSorting;

import java.util.Scanner;

public class BinarySearch {
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
        System.out.println(BinarySearch.searchElement(arr,target));

    }
    public static int searchElement(int[] arr,int target){

    int first=0;
    int last =arr.length-1;
    int mid=first+last/2;
    while(first<=last){
        if(arr[mid]==target){
            return mid;
        }
       else if(arr[mid]<target){
            first=mid+1;
        }else{
            last=mid-1;
        }
       mid=first+last/2;

    }
    return -1;

    }
}
