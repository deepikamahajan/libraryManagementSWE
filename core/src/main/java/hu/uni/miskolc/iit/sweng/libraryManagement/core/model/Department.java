package hu.uni.miskolc.iit.sweng.libraryManagement.core.model;

public class Department {
    public int _Department_Id;
    private String _Name;
    private String _Address;
    private String _PhoneNo;
    private String _ContactPerson;

    public Department(int Department_Id, String Name, String Address, String PhoneNo, String ContactPerson) {
        this._Department_Id = Department_Id;
        this._Name = Name;
        this._Address = Address;
        this._PhoneNo = PhoneNo;
        this._ContactPerson = ContactPerson;
    }

    public String get_Name() {
        return _Name;
    }

    public void set_Name(String _Name) {
        this._Name = _Name;
    }

    public String get_Address() {
        return _Address;
    }

    public void set_Address(String _Address) {
        this._Address = _Address;
    }

    public int get_Department_Id() {
        return _Department_Id;
    }

    public void set_Department_Id(int _Department_Id) {
        this._Department_Id = _Department_Id;
    }

    public String get_ContactPerson() {
        return _ContactPerson;
    }

    public void set_ContactPerson(String _ContactPerson) {
        this._ContactPerson = _ContactPerson;
    }

    public String get_PhoneNo() {
        return _PhoneNo;
    }

    public void set_PhoneNo(String _PhoneNo) {
        this._PhoneNo = _PhoneNo;
    }

}
