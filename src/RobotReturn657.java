public class RobotReturn657 {

    public static void main(String[] args) {

    }

    public boolean judgeCircle(String moves) {
        int vertical = 0;
        int horizontal = 0;
        for (char c : moves.toCharArray()) {
            if (c == 'U') vertical++;
            if (c == 'D') vertical--;
            if (c == 'L') horizontal--;
            if (c == 'R') horizontal--;
        }

        return vertical == 0 && horizontal == 0;
    }
}
