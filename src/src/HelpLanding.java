package src;

public class HelpLanding {

    private String namn;
    private String beskrivning;

    public HelpLanding() {

    }

    public HelpLanding(String felprocedurer, String beskrivning){
        this.namn = namn;
        this.beskrivning = beskrivning;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public String getBeskrivning() {
        return beskrivning;
    }

    public void setBeskrivning(String beskrivning) {
        this.beskrivning = beskrivning;
    }

}