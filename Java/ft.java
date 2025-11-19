import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
public class ft {
    public static void main(String[] args) throws Exception {
        /* 
        java.io.File f = new File("C:\\Users\\Yashaswi Banala\\OneDrive\\Desktop\\test\\poem.txt");
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
        fw.write("Roses are red,\nViolets are blue,\nSugar is sweet,\nAnd so are you.");
        fw.write("Hello how are you? there is no poem in here");
        fw.write("This is a normal test file not poem");
        fw.write("Do you wish to write a poem");
        fw.flush();
        fw.close();

        FileReader fr = new FileReader(f);//poem ka file
        
        int i = fr.read();//Reads a single character.(i=ASCII value first character it reads)
        /*System.out.println(i + " : " + (char)i);
        fr.close();
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
            System.out.print((char)i);
            i=fr.read();
        }

        BufferedReader br = new BufferedReader(new FileReader(f));
        BufferedWriter bw = new BufferedWriter(new FileWriter(f2));
        String l = br.readLine();
        while (l != null) {
            bw.write(l);
            l = br.readLine();
        }
        br.close();
        bw.close();
        */

        String s="101,Colgate,Toothbrush,34.00,2.0";
        String data [] = s.split(",");
        System.out.println(data[1]+"costs "+data[3]);
        File f = new File("C:\\Users\\Yashaswi Banala\\OneDrive\\Desktop\\test\\Store.txt");
        BufferedReader br = new BufferedReader(new FileReader(f));
        String l = br.readLine();
        /* 
        while(l!=null) {
            String a[] = l.split(",");
            //System.out.println(a[1]+" costs "+a[3]);
            
            if(Double.parseDouble(a[3])>4.00){
                System.out.println(a[1]);
                
            }
            l=br.readLine();
        }
            */
        File f3 = new File(f.getParent(),"saleable.csv");
        FileWriter fw = new FileWriter(f3);
        BufferedWriter bw = new BufferedWriter(fw);
        while (l!= null) {
            String a[] = l.split(",");
            if (Double.parseDouble(a[3]) > 4.00) {
                bw.write(s);
                bw.newLine();
            }
            s = br.readLine();
        }
        bw.close();
        fw.close();
    }
}