package h3;

public class H3_main {
    public static void main(String[] args) {

        int[][] einheiten = {
            {50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
        int input = 6279;

        int rest = input;

        for (int i = 0; i < einheiten[0].length; i++) {
            einheiten[1][i] = rest / einheiten[0][i];
            rest -= einheiten[0][i] * einheiten[1][i];
        }

    }
}
