package model;

public class Costumer {


        private int id_costumer;
        private String name;
        private String last_name;
        private String phone;
        private String mail;
        private String passw;
        private String type;

    public Costumer(){

    }

    public Costumer(int id_costumer, String name, String last_name, String phone, String mail, String passw, String type) {
        this.id_costumer = id_costumer;
        this.name = name;
        this.last_name = last_name;
        this.phone = phone;
        this.mail = mail;
        this.passw = passw;
        this.type = type;
    }

    public int getId_costumer() {
        return id_costumer;
    }

    public void setId_costumer(int id_costumer) {
        this.id_costumer = id_costumer;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
