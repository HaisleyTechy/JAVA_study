package Section_1;

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
    public static void main(String[] args) {
        Practice test1 = new Practice();
        System.out.println(test1.ControlFlow(35));
    }
}



