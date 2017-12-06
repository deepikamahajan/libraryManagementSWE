package hu.uni.miskolc.iit.sweng.libraryManagement.core.model;

public class Member {
    private String _FirstName;
    private String _LastName;
    private String _LoginId;
    private String _Password;
    private String _Email;
    //private String _Bookname;
    private String _MobileNo;

    public Member(String FirstName, String LastName, String LoginId, String Password, String Email, String MobileNo) {
        this._FirstName = FirstName;
        this._LastName = LastName;
        this._LoginId = LoginId;
        this._Password = Password;
        this._Email = Email;
        this._MobileNo=MobileNo;
    }

    public String get_FirstName() {
        return _FirstName;
    }

    public String get_LastName() {
        return _LastName;
    }

    public String get_LoginId() {
        return _LoginId;
    }

    public String get_Password() {
        return _Password;
    }

    public String get_MobileNo() {
        return _MobileNo;
    }

    public String get_Email() {
        return _Email;
    }
}
