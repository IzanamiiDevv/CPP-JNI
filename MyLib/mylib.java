package MyLib;
import java.nio.file.Path;
import java.nio.file.Paths;

public class mylib {
    static {
        Path buff = Paths.get("MyLib/mylib.dll");
        String path = buff.toAbsolutePath().toString();
        System.load(path);
    }

    public native void print(String txt);
    public native int add(int a, int b);
}