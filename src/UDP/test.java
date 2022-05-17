package UDP;
import java.text.Normalizer;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class test {

    public static void main(String[] args) throws Exception{

        Scanner stdIn;
        stdIn = new Scanner(System.in);
        while (true){
            System.out.println("Vui lòng nhập:");
            String str = stdIn.nextLine();
            System.out.println(checkinput(str));
        }
    }
    // loại bỏ ký tự đặc biệt
    public static String checkinput(String input) {
        Pattern pattern = Pattern.compile("[[^a-z A-Z]&&[^0-9]&&[^ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚÝàáâãèéêìíòóôõùúýĂăĐđĨĩŨũƠơƯưẠ-ỹ]]");
        Matcher matcher = pattern.matcher(input);
        String xoakytuDB = matcher.replaceAll("");
        return xoakytuDB;
    }
}
