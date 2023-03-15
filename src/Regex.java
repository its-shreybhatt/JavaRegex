import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        System.out.println("Welcome to Regex Coding");
        Regex regex = new Regex();
        regex.firstName();
    }
    public void firstName(){
        Pattern pattern = Pattern.compile("[A-Z][a-z]{2,}");
        Matcher matcher = pattern.matcher("Shrey");
        boolean value = matcher.matches();
        System.out.println(value);
    }
}