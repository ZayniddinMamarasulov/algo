import java.util.List;

public class SnakeInMatrix3248 {

    public static void main(String[] args) {

    }

    public int finalPositionOfSnake(int n, List<String> commands) {

        int sum = 0;

        for (String command : commands) {
            if (command.startsWith("R")) sum += 1;
            if (command.startsWith("L")) sum -= 1;
            if (command.startsWith("U")) sum -= n;
            if (command.startsWith("D")) sum += n;
        }

        return sum;
    }
}
