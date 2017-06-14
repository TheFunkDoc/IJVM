package pad.ijvm;

import pad.ijvm.interfaces.IJVMInterface;

import java.io.InputStream;
import java.io.PrintStream;

/**
 * Created by bishop on 12-6-17.
 */

public class IJVM implements IJVMInterface{

    int[] stackContents;
    byte[] text;
    int programCounter;

    IJVM(byte[] binary){

    }

    public int topOfStack() {
        return stackContents[stackContents.length - 1];
    }

    public int[] getStackContents() {
        return stackContents;
    }

    public byte[] getText() {
        return text;
    }

    public int getProgramCounter() {
        return programCounter;
    }

    public int getLocalVariable(int i) {
        return 0;
    }

    public int getConstant(int i) {
        return 0;
    }

    public void step() {

    }

    public void run() {

    }

    public byte getInstruction() {
        return 0;
    }

    public void setOutput(PrintStream out) {

    }

    public void setInput(InputStream in) {

    }
}
