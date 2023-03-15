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
        regex.password();
        regex.upperCasePassword();
        regex.numericPassword();
        regex.specialCharPassword();
        regex.verifyEmailSamples();
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
        System.out.println("Result for emailId = " + Pattern.compile("[a-z]+[.]?[a-z]{0,}[@][a-z]+[.][a-z]{2,4}[.]?[a-z]{0,2}")
                .matcher("abc@bridgelabz.com").matches());
    }

    public void mobileNumber() {
        System.out.println("Result for Mobile Num = " + Pattern.matches("^[0-9]{2}[ ][0-9]{10}$", "91 9557885533"));
    }

    public void password() {
        Pattern pattern = Pattern.compile("[A-Za-z]{8,}");
        Matcher matcher = pattern.matcher("shreybhatt");
        System.out.println("Result for Min 8 Character = " + matcher.matches());
    }

    public void upperCasePassword() {
        Pattern patternTwo = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z]).+${8,}");
        Matcher matcherTwo = patternTwo.matcher("shreyBhatt");
        if (matcherTwo.matches() == true) {
            System.out.println("Password is Correct with atleast one UpperCase");
        } else {
            System.out.println("Password is incorrect");
        }
    }

    public void numericPassword() {
        Pattern patternTwo = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).+${8,}");
        Matcher matcherTwo = patternTwo.matcher("shreyBhatt2");
        if (matcherTwo.matches() == true) {
            System.out.println("Password is Correct with atleast one UpperCase and one Numeric");
        } else {
            System.out.println("Password is incorrect");
        }
    }

    public void specialCharPassword() {
        Pattern patternThree = Pattern.compile("^(?=.+[a-z])(?=.+[A-Z])(?=.+[0-9])(?=.+[-+_!@#$%^&*., ?]).+${8,}");
        Matcher matcherThree = patternThree.matcher("sGrey4Bha@ttyy");
        if (matcherThree.matches() == true) {
            System.out.println("Password is Correct with exact one special Character");
        } else {
            System.out.println("Password is incorrect");
        }
    }

    private void verifyEmailSamples() {
        String[] validEmails = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com",
                "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au",
                "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com"};

        String[] inValidEmails = {"abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com",
                ".abc@abc.com", "abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com",
                "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"};

        for (int i = 0; i < validEmails.length; i++) {
            System.out.println("Result for emails = " + (i + 1) + " "
                    + Pattern.matches("[a-z-+0-9]+[.]?[a-z0-9]+[@][a-z0-9]+[.][a-z]{2,4}[.]?[a-z]{0,3}", validEmails[i]));
        }
        System.out.println("\nFor Invalid Emails ");
        for (int i = 0; i < inValidEmails.length; i++) {
            System.out.println("Result for emails = " + (i + 1) + " "
                    + Pattern.matches("[a-z-+0-9]+[.]?[a-z0-9]+[@][a-z0-9]+[.][a-z]{2,4}[.]?[a-z]{0,3}", inValidEmails[i]));
        }
    }
}