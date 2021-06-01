package main.practice2;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
    private static String connect = "localhost\\MyTest,8768";
    private static String regex = "^(\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}|\\w+)|([a-zA-Z]+)|([0-9]{4})";

    public static void main(String[] args) {
        String text = "Text";
        int task1 = text.codePointAt(0);
        int task2 = text.compareToIgnoreCase("text");
        String task3 = text.toUpperCase();
        getSourceName("localhost\\MyTest,8768");
        getSourceName("localhost");
        getSourceName("212.121.121.111\\MyTest");
        getSourceName("MyTest,8768");
    }

    public static void getSourceName(String text) {
        String hostName = null;
        String portName = null;
        String instanceName = null;
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            if (matcher.group(1) != null) {
                hostName = matcher.group(1);
            }
            if (matcher.group(2) != null) {
                instanceName = matcher.group(2);
            }
            if (matcher.group(3) != null) {
                portName = matcher.group(3);
            }
        }

        System.out.println("Host\\ip :" + hostName);
        System.out.println("port : " + portName);
        System.out.println("name : " + instanceName);
        System.out.println("\n\n");
    }

}





