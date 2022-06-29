import java.util.Arrays;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.isHappy(2);
    }

    public boolean isHappy(int n) {

        String input = String.valueOf(n);
        char[] inputArray = input.toCharArray();

        int i;
        char calculation;
        int cal;
        int square;
        int sum = 0;

        HashSet<Integer> infinityCheck=new HashSet();

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
            input = String.valueOf(sum);
            inputArray = input.toCharArray();
            if(infinityCheck.contains(sum)) {
                return false;
            }
            infinityCheck.add(sum);
            sum = 0;
        }
    }
}
