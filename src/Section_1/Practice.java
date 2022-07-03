package Section_1;
import java.util.StringTokenizer;
public class Practice {
    public int getRunCatDistance(int speed, int time) {
        int distance;
        distance = speed * time;
        return distance;
    }
    public String computeDifference(int num1, int num2){
        String result = Integer.toString(Math.abs(num1 - num2));
        return result;
    }
    public int ControlFlow(int score){
        int result = score / 10;
        return result;
    }
    public String fizzBuzzBasic(int num){
        String result;
        if (num % 5 == 0){
            if (num % 3 ==0){
                result = "FizzBuzz";
            } else {
                result = "Buzz";
            }
        } else {
            if (num % 3 == 0){
                result = "Fizz";
            } else {
                result = "No FizzBuzz";
            }
        } return result;
    }
    public String fizzBuzzUsage(int num) {
        StringBuilder result = new StringBuilder("");
        if (num % 3 == 0){
            result.append("a");
        }
        if (num % 5 == 0){
            result.append("b");
        }
        switch (result.substring(0)){
            case "": return "No FizzBuzz" ;
            case "a": return "Fizz";
            case "b": return "Buzz";
            default: return "FizzBuzz";
        }
    }
    public static void main(String[] args) {
        Practice test1 = new Practice();
        System.out.println(test1.fizzBuzzUsage(11));
    }
}



