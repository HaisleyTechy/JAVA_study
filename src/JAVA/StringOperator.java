package JAVA;

public class StringOperator {
    public static void main(String[] args) {
        String name1= "Seo Coding";
        String name2 = "Seo Coding";
        String name3= new String("Seo Coding");
        String name4 = new String("Seo Coding");
        System.out.print(name1);
        System.out.print(name2);

        boolean comparison1 = name1 == "Kim Coding";      // true
        boolean comparison2 = name1 == name2;             // true
        boolean comparison3 = name1 == name3;             // false
        boolean comparison4 = name3 == name4;             // false
        boolean comparison5 = name1.equals("Kim Coding"); // true
        boolean comparison6 = name1.equals(name3);        // true
        boolean comparison7 = name3.equals(name4);        // true

    }
}
