package Section_1;

public class Practice {
    public int getRunCatDistance(int speed, int time) {
        int distance;
        distance = speed * time;
        return distance;

    }
    void excute() {
        double result = getRunCatDistance(5,18);
        System.out.println(result);
    }
    public static void main(String[] args) {
        Practice test1 = new Practice();
        test1.excute();
    }
}





