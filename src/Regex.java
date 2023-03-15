import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        System.out.println("Welcome to Regex Coding");
        Regex regex = new Regex();
        regex.firstName();
        regex.lastName();
    }
    public void firstName(){
        Pattern patternOne = Pattern.compile("[A-Z][a-z]{2,}");
        Matcher matcherOne = patternOne.matcher("Shrey");
        boolean valueOne = matcherOne.matches();
        System.out.println("Result for First Name = " +valueOne);
    }
    public void lastName(){
        Pattern patternTwo = Pattern.compile("[A-z][A-za-z]{2,}");
        Matcher matcherTwo = patternTwo.matcher("BHATT");
        boolean valueTwo = matcherTwo.matches();
        System.out.println("Result for Last Name = " +valueTwo);
    }


}