package MyLib;

public class mylib {
    static {
        System.load("C:\\Users\\rosar\\OneDrive\\Documents\\PMC\\projects\\CPP-JNI\\MyLib\\mylib.dll");
    }

    public native void print(String txt);
    public native int add(int a, int b);
}