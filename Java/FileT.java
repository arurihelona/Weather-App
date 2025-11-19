import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
public class FileT {
    public static void main(String[] args) throws Exception {
        java.io.File f = new File("C:\\Users\\admin\\Desktop\\test\\poem.txt");
        System.out.println("File name: " + f.getName());
        System.out.println("Absolute path: " + f.getAbsolutePath());
        System.out.println("Canonical path: " + f.getCanonicalPath());
        File f1 =new File("com/kmec/csm");
        f1.mkdirs();
        File f2 = new File(f1, "copyofpoem.txt");
        if(!f2.exists()) {
            f2.createNewFile();
        }   
        FileWriter fw = new FileWriter(f2);
        fw.write("Roses are red,\nViolets are blue,\nSugar is sweet,\nAnd so are you.\n");
        fw.write("Hello how are you? there is no poem in here\n");
        fw.write("This is a normal test file not poem\n");
        fw.write("Do you wish to write a poem\n");
        fw.flush();
        fw.close();

        FileReader fr = new FileReader(f);//poem ka file
        
        int i = fr.read();//Reads a single character.(i=ASCII value first character it reads)
        /*System.out.println(i + " : " + (char)i);
        fr.close();*/
        while (i != -1) {
            System.out.print((char)i);
            i = fr.read();
        }
        System.out.println("\nPoem has ended");
        int count=0;
        while(i!=-1) {
            if((char)i=='\n') {
                count++;
            }
            
            i=fr.read();
        }

    }
}