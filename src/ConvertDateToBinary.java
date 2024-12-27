public class ConvertDateToBinary {

    public static void main(String[] args) {
        convertDateToBinary("2080-02-29");
    }

    public static String convertDateToBinary(String date) {
        StringBuffer buffer = new StringBuffer();

        String[] dates = date.split("-");

        buffer.append(toBinary(Integer.parseInt(dates[0])));
        buffer.append("-");
        buffer.append(toBinary(Integer.parseInt(dates[1])));
        buffer.append("-");
        buffer.append(toBinary(Integer.parseInt(dates[2])));

        System.out.println(buffer);
        return buffer.toString();
    }

    public static String toBinary(int x) {
        StringBuffer buffer = new StringBuffer();

        while (x >= 1) {
            buffer.insert(0, x % 2);
            x /= 2;
        }

        return buffer.toString();
    }
}
