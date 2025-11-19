class MyException extends Exception {
 MyException(String msg) { 
    super(msg);
 }
}
class tyu {
 void check(int age) throws MyException {
    if(age < 18) throw new MyException("Age must be >= 18");
 }
 public static void main(String[] args) {
 Test t = new Test();
 try { t.check(15); }
 catch(MyException e) { System.out.println(e); }
 }
}
