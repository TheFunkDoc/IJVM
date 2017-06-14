package pad.ijvm;

import pad.ijvm.interfaces.IJVMInterface;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class MachineFactory {

    public static IJVMInterface createIJVMInstance(File binary) throws IOException {

        // Create new machine instance here and return it.
        // 1) Load the binary

        byte[] bytes = new byte[(int)binary.length()];

        FileInputStream fileInputStream = new FileInputStream(binary);
        fileInputStream.read(bytes);
        fileInputStream.close();


        // 2) Return the new IJVM instance without starting it.

        IJVMInterface instance;
        IJVM ijvm = new IJVM(bytes);
        instance = ijvm;

        return instance;
    }

}
