public class User {


    String Namn;
    String Losenord;
    String Email;
    int arbetsId;
    String position;

    public User(String namn, String losenord, String email, int arbetsId, String position) {
        this.Namn = namn;
        this.Losenord = losenord;
        this.Email = email;
        this.arbetsId = arbetsId;
        this.position = position;



    }

    @Override
    public String toString() {
        return Namn + " "+  Losenord +" " + Email +" "+  arbetsId +" " + position;

    }

    public String getNamn() {
        return Namn;
    }

    public void setNamn(String namn) {
        Namn = namn;
    }

    public String getLosenord() {
        return Losenord;
    }

    public void setLosenord(String losenord) {
        Losenord = losenord;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getArbetsId() {
        return arbetsId;
    }

    public void setArbetsId(int arbetsId) {
        this.arbetsId = arbetsId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
