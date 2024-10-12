package Behavioural_DP.Command_DP.Example_1;

//receiver class
public class File {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public String open() {
        return "Opening File " + name;
    }

    public String save() {
        return "Saving File " + name;
    }
}
