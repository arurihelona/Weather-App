import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
public class FileTestt {
    public static void main(String args[]) throws Exception{
        File f=new File("poem.txt");
        // String d=f.getAbsolutePath();
        // String e=f.getCanonicalPath();
        // System.out.println(d);
        // System.out.println(e);
        File f1=new File("com1/kmec1/cse1");
        f1.mkdirs();
        File f2=new File(f1,"copyofpoem1.txt");
        if(!f2.exists())
            f2.createNewFile();
        
        // FileWriter fw=new FileWriter(f2);
        // fw.write("Hello how are you?there is no poem");
        // fw.flush();
        // fw.close();
        
        // FileReader fr=new FileReader(f);
        // int i=fr.read();//first character from poem.txt
        // System.out.println(i);//ascii value
        // System.out.println((char)i);
        // int counter=0;
        // while(i!=-1){
        //     if((char)i=='\n'){
        //         ++counter;
        //     }
        //     System.out.print((char)i);
        //     i=fr.read();
        // }
        // System.out.println("/nthe no of line="+counter);
        // System.out.println("poem has ended");
        FileReader fr=new FileReader(f);
        FileWriter fw=new FileWriter(f2);
        int ch=fr.read();
        while(ch!=-1){
            fw.write(ch);
            ch=fr.read();
        }
        fw.close();
        fr.close();
    }
}