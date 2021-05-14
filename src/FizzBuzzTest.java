import java.util.Scanner;

public class FizzBuzzTest {
    int number;
    public void FizzBuzzTest(){
    }
    public FizzBuzzTest(int number){
        this.number=number;
    }
    public static String fizzBuzz(int number){
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;

        if(isFizz && isBuzz)
            return "FizzBuzz";

        if(isFizz)
            return "Fizz";

        if(isBuzz)
            return "Buzz";

        return number + "";
    }
    public static void main(String[] args) {
        System.out.println("nhap number:");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
       FizzBuzzTest test=new FizzBuzzTest( number);
        System.out.println( test.fizzBuzz( number));
    }

}

