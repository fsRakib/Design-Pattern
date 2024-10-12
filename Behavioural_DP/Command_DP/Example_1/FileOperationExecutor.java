package Behavioural_DP.Command_DP.Example_1;

import java.util.ArrayList;
import java.util.List;

public class FileOperationExecutor {
    private final List<FileOperation> fileOperations = new ArrayList<>();

    public String executeOperation(FileOperation fileOperation) {
        fileOperations.add(fileOperation);
        return fileOperation.execute();
    }
}
