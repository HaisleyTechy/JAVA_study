package Section_1;
import java.util.Scanner;
import java.util.StringTokenizer;


public class ControlFlowStatementPractice {
    static Scanner myInput = new Scanner(System.in);

    public static int getRunCatDistance(int speed, int time) {
        int distance;
        distance = speed * time;
        return distance;
    }

    public static String computeDifference(int num1, int num2) {
        return Integer.toString(Math.abs(num1 - num2));
    }

    public static String fizzBuzz(int num) {
        StringBuilder result = new StringBuilder();
        if (num % 3 == 0) {
            result.append("a");
        }
        if (num % 5 == 0) {
            result.append("b");
        }
        switch (result.substring(0)) {
            case "":
                return "No FizzBuzz";
            case "a":
                return "Fizz";
            case "b":
                return "Buzz";
            default:
                return "FizzBuzz";
        }
    }

    public static long daysInMonth(int month) {
        int daysToMonth = 0;
        StringBuilder result = new StringBuilder("121010110101");
        switch (result.charAt(month - 1)) {
            case '1':
                daysToMonth = 31;
                break;
            case '2':
                daysToMonth = 28;
                break;
            case '0':
                daysToMonth = 30;
                break;
            default:
                System.out.print("Invalid Month");
        }
        return daysToMonth;
    }

    public static StringBuilder followAdd(StringTokenizer day) {
        StringBuilder dayInput = new StringBuilder();
        while (day.hasMoreTokens()) {
            String str = day.nextToken() + "요일";
            dayInput.append(str);
        }
        return dayInput;
    }

    public static String followingDay(String day) {
        StringTokenizer dayFollow = new StringTokenizer("월 화 수 목 금 토 일");
        StringBuilder stringToConvert = followAdd(dayFollow);
        String result = "올바른 요일이 아닙니다";
        while (day.contains(stringToConvert) && day.length() == 3) {
            int dayIndex = stringToConvert.indexOf(day);
            result = stringToConvert.substring(dayIndex + 1);
        }
        return result;
    }
    public static boolean isPythagorean(int num1, int num2, int num3) {
        boolean result;
        int maxLeg = Math.max(Math.max(num1, num2), Math.max(num1, num3));
        int minLeg = Math.min(Math.min(num1, num2), Math.min(num1, num3));
        if (Math.pow(num1, 2) == Math.pow(num2, 2) + Math.pow(num3, 2)) {
            result = true;
        } else if (Math.pow(num2, 2) == Math.pow(num1, 2) + Math.pow(num3, 2)) {
            result = true;
        } else if (Math.pow(num3, 2) == Math.pow(num1, 2) + Math.pow(num2, 2)) {
            result = true;
        } else {
            result = false;
        } return result;
    }
    public static boolean isOdd(int num){
        boolean result = false;
        while ((num & 1)==1) {
            result = true;
            break;
        } return result;
    }
    public static String repeatString(String str, int num) {
        String result = "";
        StringBuilder resultAppend = new StringBuilder(result);
        for (int countNum = 0; countNum < num; countNum++) {
            resultAppend.append(str);
        } return resultAppend.toString();
    }
    public static String makeDigits2(int num) {
        StringBuilder digitAppend = new StringBuilder();
        int numcount = 1;
        while (numcount <= num) {
            if (numcount !=num){
                digitAppend.append(numcount).append("-");
                numcount++;
            } else {
                digitAppend.append(numcount);
                numcount++;
            }
        } return digitAppend.toString();
    }
    public static int makeMultiplesOfDigit2(int num1, int num2) {
        int numcount = 0;
        for (int numvalue = Math.min(num1,num2); numvalue <= Math.max(num1,num2);numvalue++) {
            int numDet = numvalue;
            while ((numDet & 1)==0 && numDet != 0) {
                numcount++;
                numDet++;
            }
        } return numcount;
    }
    public static int countCharacter(String word, char word2) {
        StringTokenizer wordToDiv = new StringTokenizer(word,Character.toString(word2),false);
        int bugCount = 0;
        int tokenCount = wordToDiv.countTokens();
        for (int count =1; count < tokenCount;count++){
            bugCount++;
        } return bugCount;
    }
    public static int countCharacter2(String str, char letter) {
        int bugCount = 0;
        int numCount = 0;
        for (int count = 0; count < str.length(); count++) {
            if (str.charAt(numCount) == letter) {
                bugCount++;
            }
            numCount++;
        } return bugCount;
    }
    public boolean isPrime(int num) {
        int num3 = 0;
        for (int num2 = 1;num2 <= num;num2++) {
            while (num % num2 == 0);
                num3++;
                break;
        }
        boolean output;
        if (num3 ==2) {
            output = true;
        } else {
            output = false;
        } return output;
    }
    public static void main (String[]args){
            System.out.println("method 입력:");
            String test1 = myInput.nextLine();
            switch (test1) {
                case "Dist":
                    System.out.println("speed, time입력:");
                    int speed1 = myInput.nextInt();
                    int time1 = myInput.nextInt();
                    System.out.println(getRunCatDistance(speed1, time1));
                    break;
                case "Diff":
                    System.out.println("차이계산할 두 int 입력:");
                    int num1 = myInput.nextInt();
                    int num2 = myInput.nextInt();
                    System.out.println(computeDifference(num1, num2));
                    break;
                case "fizzBuzz":
                    System.out.println("3과 5의 fizzBuzz 계산");
                    int num3 = myInput.nextInt();
                    System.out.println(fizzBuzz(num3));
                    break;
                case "daysInMonth":
                    System.out.println("Month 입력");
                    int num4 = myInput.nextInt();
                    System.out.println(daysInMonth(num4));
                    break;
                case "followingDay":
                    System.out.println("요일 입력");
                    String data1 = myInput.nextLine();
                    //System.out.println(followingDay(data1));
                    StringTokenizer dayFollow = new StringTokenizer("월 화 수 목 금 토 일");
                    System.out.println(followAdd(dayFollow));
                    break;
                case "isPythagorean":
                    System.out.println("삼각형 세변 입력");
                    int leg1 = myInput.nextInt();
                    int leg2 = myInput.nextInt();
                    int leg3 = myInput.nextInt();
                    System.out.println(isPythagorean(leg1,leg2,leg3));
                    break;
                case "isOdd":
                    System.out.println("짝수false홀수true\n입력:");
                    int oddEven = myInput.nextInt();
                    System.out.println(isOdd(oddEven));
                    break;
                case "repeatString":
                    System.out.println("문자열과 반복횟수입력:");
                    String repeatStr = myInput.nextLine();
                    int repeatNum = myInput.nextInt();
                    System.out.println(repeatString(repeatStr, repeatNum));
                    break;
                case "makeDigits2":
                    System.out.println("문자열만들 정수형입력");
                    int Digitnum1 = myInput.nextInt();
                    System.out.println(makeDigits2(Digitnum1));
                    break;
                case "makeMultiplesOfDigit2":
                    System.out.println("입력정수 사이 2의배수");
                    int Digitnum2 = myInput.nextInt();
                    int Digitnum3 = myInput.nextInt();
                    System.out.println(makeMultiplesOfDigit2(Digitnum2,Digitnum3));
                    break;
                case "countCharacter":
                    System.out.println("String입력:");
                    String stringToFind = myInput.nextLine();
                    System.out.println("찾을 char입력:");
                    char charToFind = myInput.next().charAt(0);
                    System.out.println(countCharacter(stringToFind, charToFind));
                    break;

                default:
                    System.out.println("Method Not Found!");
            }
        }
    }



