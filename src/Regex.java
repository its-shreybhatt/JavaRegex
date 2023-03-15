import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        System.out.println("Welcome to Regex Coding");
        Regex regex = new Regex();
        regex.firstName();
        regex.lastName();
        regex.emailId();
        regex.mobileNumber();
        regex.passwordOne();
        regex.passwordTwo();
    }

    public void firstName() {
        Pattern patternOne = Pattern.compile("[A-Z][a-z]{2,}");
        Matcher matcherOne = patternOne.matcher("Shrey");
        boolean valueOne = matcherOne.matches();
        System.out.println("Result for First Name = " + valueOne);
    }

    public void lastName() {
        Pattern patternTwo = Pattern.compile("[A-z][A-za-z]{2,}");
        Matcher matcherTwo = patternTwo.matcher("BHATT");
        boolean valueTwo = matcherTwo.matches();
        System.out.println("Result for Last Name = " + valueTwo);
    }

    public void emailId() {
        System.out.println("Result for emailId = " +Pattern.compile("[a-z]+[.]?[a-z]{0,}[@][a-z]+[.][a-z]{2,4}[.]?[a-z]{0,2}")
                .matcher("abc@bridgelabz.com").matches());
    }

    public void mobileNumber() {
        System.out.println("Result for Mobile Num = " + Pattern.matches("^[0-9]{2}[ ][0-9]{10}$","91 9557885533"));
    }
    public void passwordOne() {
        Pattern pattern = Pattern.compile("[A-Za-z]{8,}");
        Matcher matcher = pattern.matcher("shreybhatt");
        System.out.println("Result for Min 8 Character = " + matcher.matches());
    }
    public void passwordTwo() {
        Pattern patternTwo = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z]).+${8,}");
        Matcher matcherTwo = patternTwo.matcher("shreyBhatt");
        if (matcherTwo.matches()==true){
            System.out.println("Password is Correct with atleast one UpperCase");
        }else {
            System.out.println("Password is incorrect");
        }
    }
}