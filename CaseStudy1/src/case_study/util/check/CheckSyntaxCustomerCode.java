package case_study.util.check;

public class CheckSyntaxCustomerCode {
    public static final String REGEX_CODE = "^[C][1-9]{1}[0-9]{5}$";
    public static Boolean CustomerCode(String code){
        return code.matches(REGEX_CODE);
}}
