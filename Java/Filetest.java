import java.io.*;

class Filetest {
    public static void main(String[] args) throws IOException {
        File f = new File("java.txt");
        f.createNewFile();
        File f1 = new File("mid1");
        File f2 = new File("mid1");
        f1.mkdir();
        f2.mkdir();
        File f3 = new File(f1,"java");
        f3.mkdir();
        File f4 = new File(f3,"chap1/chap2/chap3");
        f4.mkdirs();
        System.out.println("Name Stored as: "+f4.list());
        String [] a = f4.list();
        for(String s : a){
            System.out.println("Real name of file: "+s);
            File [] j = f4.listFiles();
            for(File x : j){
                System.out.println("getAbsoluteFile "+x.getAbsoluteFile());
                System.out.println("lastModified "+x.lastModified());
                System.out.println("length "+x.length());
                System.out.println("getFreeSpace "+x.getFreeSpace());
                System.out.println("getTotalSpace "+x.getTotalSpace());
                System.out.println("getUsableSpace "+x.getUsableSpace());
            }
        }



    }
}
