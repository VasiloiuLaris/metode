import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    //modificator de acces
    public static int multiplyTwoNumbers(int numberOne, int numberTwo){
        return numberOne * numberTwo;
    }
    public static int addingFourNumbers(int numberOne, int numberTwo, int numberThree, int numberFour){
        return numberOne + numberTwo + numberThree + numberFour;
    }
    public static int divdedTwoNumbers(int num1, int num2){
        return num1 / num2;
    }
    public static void getCurrentDatetIME(){
        Date date = new Date();
        System.out.println(date.getTime());
    }

    public static void main(String[] args) {
        int sum = multiplyTwoNumbers(3,5);
        int sum2 = multiplyTwoNumbers(6, 9);
        int sum3 = multiplyTwoNumbers(18, 72);
        int sum4 = divdedTwoNumbers(10, 5);
        int sum5 = addingFourNumbers(1, 2, 3, 4);
        System.out.println(sum4);
        System.out.println(multiplyTwoNumbers(8, 8));
        getCurrentDatetIME();






    }
}