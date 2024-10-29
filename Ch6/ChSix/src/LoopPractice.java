import java.util.ArrayList;
import java.util.Scanner;

public class LoopPractice {
    public static void main(String[] args) {
        System.out.println(sumCubeRoots1000());

    }

    //Problem 1.
    public static double avgQuiz() {
        boolean enterMore = true;
        int quizCount = 0;
        int addedScore = 0;
        Scanner sc = new Scanner(System.in);
        while (enterMore) {
            System.out.println("Enter Score (Enter -999 if done): ");
            int input = sc.nextInt();

            if (input == -999) {
                enterMore = false;
            } else {
                addedScore += input;
                quizCount++;
            }

        }

        return Math.round((addedScore / quizCount) * 10) / 10;

    }

    //Problem 2a.
    //I did an overloaded method for cases a. and b. below that takes in an argument (int n)
    public static int sumCubes() {
        int cubeCount = 0;
        int i = 1;
        int addedCubes = 0;

        while (cubeCount < 30) {
            double currentCube = Math.pow(i, 1.0 / 3);
            int currentCubeInt = (int) Math.round(currentCube);

            if (Math.abs(currentCube - currentCubeInt) <= 1E-14) {
                addedCubes += i;
                cubeCount++;
            }

            i++;

        }

        System.out.println("The last index is: " + i);
        return addedCubes;
    }

    //Problem 2b.
    public static int sumCubes(int n) {
        int cubeCount = 0;
        int i = 1;
        int addedCubes = 0;

        while (cubeCount < n) {
            double currentCube = Math.pow(i, 1.0 / 3);
            int currentCubeInt = (int) Math.round(currentCube);

            if (Math.abs(currentCube - currentCubeInt) <= 1E-14) {
                addedCubes += i;
                cubeCount++;
            }

            i++;

        }

        System.out.println("The last index is: " + i);
        return addedCubes;
    }

    //Problem 3a.
    public static int sumCubeRoots() {
        int i = 1;
        int addedCubes = 0;

        while (addedCubes < 200) {
            System.out.println("The current sum is: " + addedCubes);

            double currentCube = Math.pow(i, 1.0 / 3);
            int currentCubeInt = (int) Math.round(currentCube);

            if (Math.abs(currentCube - currentCubeInt) <= 1E-14) {
                addedCubes += i;
            }

            i++;

        }


        return addedCubes;
    }

    //Problem 3b.
    public static int sumCubeRoots(int n) {
        int cubeCount = 0;
        int i = 1;
        int addedCubes = 0;

        while (addedCubes < n) {
            System.out.println("The current sum is: " + addedCubes);

            double currentCube = Math.pow(i, 1.0 / 3);
            int currentCubeInt = (int) Math.round(currentCube);

            if (Math.abs(currentCube - currentCubeInt) <= 1E-14) {
                addedCubes += i;
                cubeCount++;
            }

            i++;

        }


        return addedCubes;
    }

    //Problem 4. (I found it much easier to think in terms of array lists, as the while loop considers the sum of the next largset sum possible (while it keeps running as 784 is still under 1000);
    // I just used it to get the last index of sums (as that index is the one that is less that 1000.
    public static int sumCubeRoots1000() {
        ArrayList<Integer> sums = new ArrayList<Integer>();

        int i = 1;
        int addedCubes = 0;

        while (addedCubes < 1000) {
            //System.out.println("The current sum is: " + addedCubes);

            double currentCube = Math.pow(i, 1.0 / 3);
            int currentCubeInt = (int) Math.round(currentCube);

            if (Math.abs(currentCube - currentCubeInt) <= 1E-14) {
                addedCubes += i;
                sums.add(addedCubes);
            }

            i++;

        }
        return sums.get(sums.size()-2);
    }

}
