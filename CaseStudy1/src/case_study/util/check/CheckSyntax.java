package case_study.util.check;

public class CheckSyntax {
    //-----------------------check syntax email--------------------------------
    public static final String REGEX_EMAIL = "^[A-Za-z0-9]+@[a-z]+.(com)$";
    public static boolean checkEmail (String email) {return email.matches(REGEX_EMAIL);}

    //-----------------------check syntax phone----------------------------------
    public static final String REGEX_PHONE = "^(\\+84|0)[0-9]{9}$";
    public static boolean checkPhone(String phone){
        return phone.matches(REGEX_PHONE);
    }

    //------------------------check syntax mã khách hàng------------------------
    public static final String REGEX_CODECUSTOMER = "^[C][0-9]{5}$";
    public static boolean CustomerCode(String customerCode) {return customerCode.matches(REGEX_CODECUSTOMER);}

    //--------------------------check syntax mã nhân viên--------------------------
    public static final String REGEX_CODEEMPLOYEE = "^[E][0-9]{5}$";
    public static boolean EmployeeCode(String employeeCode){return employeeCode.matches(REGEX_CODEEMPLOYEE);}

    //--------------------------check syntax CMND------------------------------
    public static final String REGEX_ID = "^[1-9]{1}[0-9]{8}$";
    public static boolean checkId(String id){return id.matches(REGEX_ID);}

    //---------------------------check syntax tên-----------------------------
    public static final String REGEX_Name = "^[A-Z][a-z]*(\\s[A-Z][a-z]*)+$";
    public static boolean chekName(String name){return name.matches(REGEX_Name);}

    //---------------------------check syntax villa serial----------------------
    public static final String REGEX_VILLA= "^(SVVL)[0-9]{4}$";
    public static boolean checkVilla(String villaSerial){return  villaSerial.matches(REGEX_VILLA);
    }
    //---------------------------check syntax house serial----------------------
    public static final String REGEX_HOUSE= "^(SVHO)[0-9]{4}$";
    public static boolean checkHouse(String villaSerial){return  villaSerial.matches(REGEX_HOUSE);

    }
    //---------------------------check syntax room serial----------------------
    public static final String REGEX_ROOM= "^(SVRO)[0-9]{4}$";
    public static boolean checkRoom(String villaSerial){return  villaSerial.matches(REGEX_ROOM);


    }



}