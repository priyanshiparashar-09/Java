package practice;

public class test1 {
    public static void main(String[] args) {
        String s="Priyanshi pA4RASHAR";
        String revers=reverseStr(s);
        System.out.println(revers);
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
}
