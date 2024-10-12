package Behavioural_DP.Command_DP.Example_1;

public class SaveFile implements FileOperation {

    private File file;

    public SaveFile(File file) {
        this.file = file;
    }

    @Override
    public String execute() {

        return file.save();
    }

}
