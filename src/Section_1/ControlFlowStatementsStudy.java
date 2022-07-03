package Section_1;

import java.util.Scanner;

public class ControlFlowStatementsStudy {
    static Scanner myInput = new Scanner(System.in);

    public static void ifStudy() {
        String dice = myInput.nextLine(); //주사위 번호 입력값을 받아옵니다.

        if (dice.equals("1")) { // 입력한 주사위 번호가 1이면 다음 블록을 실행
            System.out.println("1번"); // 콘솔에 "1번"을 출력
        } else if (dice.equals("2")) {
            System.out.println("2번");
        } else if (dice.equals("3")) {
            System.out.println("3번");
        } else if (dice.equals("4")) {
            System.out.println("4번");
        } else if (dice.equals("5")) {
            System.out.println("5번");
        } else if (dice.equals("6")) {
            System.out.println("6번");
        } else {
            System.out.println("if없는 숫자! " + dice);
        }
    }

    public static void switchStudy() {
        String dice = myInput.nextLine(); //주사위 번호 입력값을 받아옵니다.
        switch (dice) {
            case "1":
                System.out.println("1번");
                break; //다음 case를 실행하지 않고, switch문 탈출!
            case "2":
                System.out.println("2번");
                break;
            case "3":
                System.out.println("3번");
                break;
            case "4":
                System.out.println("4번");
                break;
            case "5":
                System.out.println("5번");
                break;
            case "6":
                System.out.println("6번");
                break;
            default: //switch문의 괄호 안 값과 같은 값이 없으면, 여기서 실행문 실행
                System.out.println("switch없는 숫자! " + dice);
                break;
        }
    }

    public static String convertScoreToGradeWithPlusAndMinus(int score) {
        String Grade = null;
        if (score <= 100 && score >= 0) {
            if (score == 100) {
                Grade = "A+";
            } else if (score / 10 == 9) {
                Grade = "A";
            } else if (score / 10 == 8) {
                Grade = "B";
            } else if (score / 10 == 7) {
                Grade = "C";
            } else if (score / 10 == 6) {
                Grade = "D";
            } else {
                Grade = "F";
            }
            if (score >= 60 && score <100) {
                if (score % 10 >= 8) {
                    Grade += "+";
                } else if (score % 10 <= 3 && score != 93) {
                    Grade += "-";
                } else if (score == 93){
                    Grade = "A";
                } else {
                    Grade = Grade;
                }
            }
        } else {
            return("INVALID SCORE");
        } return Grade;
    }



    public static void main(String[] args) {
        System.out.println("if 혹은 switch 혹은 점수를 입력:");
        String decisionIn = myInput.nextLine();
        switch (decisionIn) {
            case "if":
                ifStudy();
                break;
            case "switch":
                switchStudy();
                break;
            default:
                System.out.println(convertScoreToGradeWithPlusAndMinus(Integer.parseInt(decisionIn)));
                break;
        }

    }
}





