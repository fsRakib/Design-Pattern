package Behavioural_DP.Command_DP.Example_1;

public class OpenFile implements FileOperation{

    //receiver
    private File file;
    
    public OpenFile(File file) {
        this.file = file;
    }

    @Override
    public String execute() {
        
        return file.open();
    }
    
}
