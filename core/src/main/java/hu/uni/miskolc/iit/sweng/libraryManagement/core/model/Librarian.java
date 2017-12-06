package hu.uni.miskolc.iit.sweng.libraryManagement.core.model;

public class Librarian {
    private String _FirstName;
    private String _LastName;
    private String _LoginId;
    private String _Password;
    private String _Email;
    private String _Homeaddress;
    private String _MobileNo;

    public Librarian(String FirstName, String LastName, String LoginId, String Password, String Email, String Homeaddress, String MobileNo) {
        this._FirstName = FirstName;
        this._LastName = LastName;
        this._LoginId = LoginId;
        this._Password = Password;
        this._Email = Email;
        this._Homeaddress = _Homeaddress;
        this._MobileNo = _MobileNo;
    }


    public String get_FirstName() {
        return _FirstName;
    }

    public void set_FirstName(String _FirstName) {
        this._FirstName = _FirstName;
    }

    public String get_LastName() {
        return _LastName;
    }

    public void set_LastName(String _LastName) {
        this._LastName = _LastName;
    }

    public String get_LoginId() {
        return _LoginId;
    }

    public void set_LoginId(String _LoginId) {
        this._LoginId = _LoginId;
    }

    public String get_Password() {
        return _Password;
    }

    public void set_Password(String _Password) {
        this._Password = _Password;
    }

    public String get_Email() {
        return _Email;
    }

    public void set_Email(String _Email) {
        this._Email = _Email;
    }

    public String get_Homeaddress() {
        return _Homeaddress;
    }

    public void set_Homeaddress(String _Homeaddress) {
        this._Homeaddress = _Homeaddress;
    }

    public String get_MobileNo() {
        return _MobileNo;
    }

    public void set_MobileNo(String _MobileNo) {
        this._MobileNo = _MobileNo;
    }
}
