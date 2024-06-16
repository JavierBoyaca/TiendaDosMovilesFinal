package model;

public class Employee {

    private int id_Employee;
    private String name;
    private String last_name;
    private String phone;
    private String mail;
    private String passw;
    private String position;


    public Employee() {

    }

    public Employee(int id_Employee, String name, String last_name, String phone, String mail, String passw, String position) {
        this.id_Employee = id_Employee;
        this.name = name;
        this.last_name = last_name;
        this.phone = phone;
        this.mail = mail;
        this.passw = passw;
        this.position = position;
    }

        public int getId_Employee() {
        return id_Employee;
    }

    public void setId_Employee(int id_Employee) {
        this.id_Employee = id_Employee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassw() {
        return passw;
    }

    public void setPassw(String passw) {
        this.passw = passw;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
