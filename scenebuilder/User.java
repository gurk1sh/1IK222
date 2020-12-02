package src;

public class User {
    private String name;
    private String userName;
    private String email;
    private int workRole;
    private int workID;
    private int telephone;

    public User()
    {

    }

    public User(String newName, String newUserName, String newEmail, int newWorkRole, int newWorkID, int newTelephone)
    {
        this.name = newName;
        this.userName = newUserName;
        this.email = newEmail;
        this.workRole = newWorkRole;
        this.workID = newWorkID;
        this.telephone = newTelephone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getWorkRole() {
        return workRole;
    }

    public void setWorkRole(int workRole) {
        this.workRole = workRole;
    }

    public int getWorkID() {
        return workID;
    }

    public void setWorkID(int workID) {
        this.workID = workID;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }
}
