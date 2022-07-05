package case_study.util.check;

public class CheckSyntaxEmployeeCode {
    public static final String REGEX_CODE = "^[E][1-9]{1}[0-9]{5}$";
    public static Boolean EmployeeCode(String code){
        return code.matches(REGEX_CODE);
    }
}
