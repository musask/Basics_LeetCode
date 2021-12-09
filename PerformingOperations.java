package leetcode.problems.easy.array;

public class PerformingOperations {

    public static void main(String arg[]) {

        String[] operations = new String[]{"X++", "++X", "--X", "X--"};

        int X = 0;


        for (int i = 0; i < operations.length; i++) {
            if (operations[i].startsWith("--")) {
                --X;
            } else if (operations[i].startsWith("++")) {
                ++X;
            } else if (operations[i].endsWith("++")) {
                X++;
            } else {
                X--;
            }
        }

        System.out.println(X);

    }
}
