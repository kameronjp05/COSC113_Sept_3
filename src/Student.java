//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

https://github.com/kameronjp05/COSC113_Sept_3.git

public class Student {

    String Fn;

    String Ln;

    int Sid;

    Student(){
        this.Fn= "no first name";
        this.Ln= "no last name";
        this.Sid= 0;
    }

    Student(String Fn, String Ln)  {
        this.Fn = Fn;
        this.Ln = Ln;
    }

        Student(String Fn, String Ln, int Sid) {
            this(Fn,Ln);
            this.Sid = Sid;
        }

    Student(String Fn, int Sid, String Ln) {
        this.Fn = Fn;
        this.Ln = Ln;
        this.Sid = Sid;
    }

    //Methods = getters and setters
    public String getFn() {
        return Fn;
    }

    public void setFn(String fn) {
        this.Fn = fn;
    }

    public int getSid() {
        return Sid;
    }

    public void setSid(int sid) {
        Sid = sid;
    }

    public String getLn() {
        return Ln;
    }

    public void setLn(String ln) {
        Ln = ln;
    }

    public static void main(String[] args) {

        Student s6 = new Student();
        s6.Fn = "Melanie";
        s6.setLn("Thomas");
        s6.Ln = "Simpson";

        Student s4 = new Student("Helena", "Payton" );
        System.out.println(s4.Fn);
        System.out.println(s4.Ln);
        System.out.println(s4.Sid);


        Student s1;
        s1 = new Student();
        System.out.println(s1);
        System.out.println(s1.Fn);

        Student s2;
        s2 = new Student("tobiloba", "Ayodeji", 14141);
        System.out.println(s2.Fn);
        System.out.println(s2.Ln);

        Student s3;
        String Fn = "Miguel";
        String Ln = "Gascaortega";
        int Sid = 31415;
        s3 = new Student(Fn, Ln, Sid);
        System.out.println(s3.Fn);
        System.out.println(s3.Ln);

        Student s5;
        s5 = new Student(Fn, Sid, Ln);



    }
}