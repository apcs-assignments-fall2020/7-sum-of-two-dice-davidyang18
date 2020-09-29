import java.util.Scanner;

public class MyMain {

    // Rolls a single die
    // Returns a random integer between 1 and 6
    public static int rollDie() {
        int value = (int) (Math.random() * 6) + 1;
        return value;
    }

    // Rolls two dice n times
    // This method returns an int array of size 11, where each element is
    // the number of times a certain sum of two dice was rolled
    public static int[] sumOfTwoDice(int n) {
        int Die1 = rollDie();
        int Die2 = rollDie();
        int sum = Die1 + Die2;
        int [] arr = new int [11];
        for (int i = 0; i < arr.length; i++) {
            if (sum == 2) {
                arr[0] = 1;
            }
            else if (sum == 3) {
                arr[1] = 1;
            }
            else if (sum == 4) {
                arr[2] = 1;
            }
            else if (sum == 5) {
                arr[3] = 1;
            }
            else if (sum == 6) {
                arr[4] = 1;
            }
            else if (sum == 7) {
                arr[5] = 1;
            }
            else if (sum == 8) {
                arr[6] = 1;
            }
            else if (sum == 9) {
                arr[7] = 1;
            }
            else if (sum == 10) {
                arr[8] = 1;
            }
            else if (sum == 11) {
                arr[9] = 1;
            }
            else if (sum == 12) {
                arr[10] = 1;
            }
            System.out.print(arr[i]);
            }
            return null;
            }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many times would you roll these two dice?");
        int times = sc.nextInt();
        System.out.print(sumOfTwoDice(times));
    }
}
