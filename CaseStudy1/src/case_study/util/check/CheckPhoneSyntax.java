package case_study.util.check;

public class CheckPhoneSyntax {
    public static final String REGEX_PHONE = "^(\\+84|0)[0-9]{9}$";
    public static Boolean checkPhone(String phone){
        return phone.matches(REGEX_PHONE);
    }
}
