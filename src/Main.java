import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        find();
    }
    public static void find() throws IOException {
        File[] arr=File.listRoots();
        for(File f:arr){
            find(f);
        }
    }
    public static void find(File src) throws IOException {
        File[] files=src.listFiles();
        if(files!=null){
            for (File file:files){
                if(file.isFile()){
                    String name= file.getName();
                    if(name.equals("steam.exe")){
                        System.out.println(file);
                        Runtime rc=Runtime.getRuntime();
                        rc.exec(file.getAbsolutePath());
                    }
                }else {
                    find(file);
                }
            }
        }
    }
}