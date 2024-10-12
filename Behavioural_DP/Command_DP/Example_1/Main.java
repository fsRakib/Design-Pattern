package Behavioural_DP.Command_DP.Example_1;

public class Main {
    public static void main(String[] args) {
        FileOperationExecutor fileOperationExecutor = new FileOperationExecutor();

        String openResult = fileOperationExecutor.executeOperation(new OpenFile(new File("file1.txt")));
        System.out.println(openResult);

        String saveResult = fileOperationExecutor.executeOperation(new SaveFile(new File("file2.txt")));
        System.out.println(saveResult);
    }
}
