import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.isHappy(163);
    }

    public boolean isHappy(int n) {

        String input = String.valueOf(n);
        char[] inputArray = input.toCharArray();

        int i;
        char calculation;
        int cal;
        int square;
        int sum = 0;
        char[] infinityCheckerIn;

        while (true) {
            for (i = 0; i < inputArray.length; i++) {
                calculation = inputArray[i];
                cal = calculation - '0';
                square = cal * cal;
                sum += square;
                if (sum == 1 && i == inputArray.length - 1) {
                    System.out.println("true");
                    return true;
                }
            }
            infinityCheckerIn = inputArray;
            input = String.valueOf(sum);
            inputArray = input.toCharArray();
            sum = 0;
            if(Arrays.equals(infinityCheckerIn, inputArray)) {
                System.out.println("false");
                return false;
            }
        }
    }
}
