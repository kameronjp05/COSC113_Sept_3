//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Student {

    String Fn;

    String Ln;

    int Sid;

    Student(){
        this.Fn= "no first name";
        this.Ln= "no last name";
        this.Sid= 0;
    }

        Student(String Fn, String Ln, int Sid) {
            this.Fn = Fn;
            this.Ln = Ln;
            this.Sid = Sid;
        }

    public static void main(String[] args) {
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

    }
}