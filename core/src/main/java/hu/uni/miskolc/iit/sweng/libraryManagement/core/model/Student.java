package hu.uni.miskolc.iit.sweng.libraryManagement.core.model;

public class Student {
    private int _Department_Id;
    private String _FirstName;
    private String _SecondName;
    private String _Address;
    private String _MobileNo;

    public Student(int Department_Id, String FirstName, String SecondName, String Address, String MobileNo) {
        this._Department_Id = Department_Id;
        this._FirstName = FirstName;
        this._SecondName = SecondName;
        this._Address = Address;
        this._MobileNo = MobileNo;
    }

    public String get_FirstName() {
        return _FirstName;
    }

    public void set_FirstName(String _FirstName) {
        this._FirstName = _FirstName;
    }

    public String get_SecondName() {
        return _SecondName;
    }

    public void set_SecondName(String _SecondName) {
        this._SecondName = _SecondName;
    }

    public String get_Address() {
        return _Address;
    }

    public void set_Address(String _Address) {
        this._Address = _Address;
    }

    public String get_MobileNo() {
        return _MobileNo;
    }

    public void set_MobileNo(String _MobileNo) {
        this._MobileNo = _MobileNo;
    }

    public void set_Department_Id(int _Department_Id) {
        this._Department_Id = _Department_Id;
    }
}
