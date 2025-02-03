public class RotateString796 {

    public static void main(String[] args) {

    }

    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        return (s + s).contains(goal);
    }
}
