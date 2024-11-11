package ma.Cabinet.entity;

public class UserInfo {
    private int id;
    private String name;
    private String email;
    private String phone ;
    private String Password ;


    public UserInfo(int id, String name, String email, String phone , String Password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.Password = Password;

    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPassword() {
        return Password;
    }
    public void setPassword(String Password) {
        this.Password = Password;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
