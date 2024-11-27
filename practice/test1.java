package practice;

public class test1 {
    public static void main(String[] args) {
        String s="Priyanshi pA4RASHAR";
        String revers=reverseStr(s);
        System.out.println(revers);
        largestNumInArray();
    }
    public static String reverseStr(String input){
        String arr[]=input.split(" ");
        String reverseInput="";
        for(String a:arr){
            String c="";
           for(int i=a.length()-1;i>=0;i--){
               c+=a.charAt(i);
           }
           reverseInput=reverseInput+" "+c;

        }
        return reverseInput;


    }

    public static void largestNumInArray(){

        int[] arr={1,2,4,5,6,1};
        int l=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>l){
                l=arr[i];
            }

        }
        System.out.println(l);


    }
}
