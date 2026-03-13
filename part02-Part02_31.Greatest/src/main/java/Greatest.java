
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        //write some code here
        int greater = number1;
        
        if (number2 > greater) {
            greater = number2;
        }

        if (number3 > greater) {
            greater = number3;
        }

        return greater;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
