import java.util.Objects;
import java.util.Stack;
import java.util.stream.Collectors;

public class SimplifyPath71 {

    public static void main(String[] args) {
//        System.out.println(simplifyPath("/home/"));
//        System.out.println(simplifyPath("/home//foo/"));
        System.out.println(simplifyPath("/home/user/Documents/../Pictures"));
    }

    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] folders = path.split("/");

        for (String folder : folders) {
            if (Objects.equals(folder, "..")) {
                if (!stack.isEmpty()) stack.pop();
                continue;
            }

            if (Objects.equals(folder, ".") || folder == "")
                continue;

            stack.push(folder);
        }


        return "/" + String.join("/", stack);
    }
}
