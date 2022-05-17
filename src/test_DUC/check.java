package test_DUC;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class check {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean b ;
        do {
            System.out.println("input txt :");
            String txt = sc.nextLine();
            Pattern p = Pattern.compile("^[A-Za-z0-9ÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚÝàáâãèéêìíòóôõùúýĂăĐđĨĩŨũƠơƯưẠ-ỹ ]+$");
            Matcher m = p.matcher(txt);
            b = m.find();
            System.out.println(b);
        }while(b==false);
        System.out.println(b);
    }
}
