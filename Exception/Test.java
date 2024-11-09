package Exception;

public class Test {
    public static void validate(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Your age is not valid");
        }else{
            System.out.println("you are ready to vote");
        }
    }
    public static void main(String[] args) {
        int a=18;
        try{
            validate(a);
        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("You are in finally block");
        }

    }
}
