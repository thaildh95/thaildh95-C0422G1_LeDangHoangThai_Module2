package case_study.util.check;

public class CheckSyntaxId {
 public static final String REGEX_ID = "^[1-9]{1}[0-9]{8}$";//a

    public static Boolean chekId(String id){
        return id.matches(REGEX_ID);
    }

}
