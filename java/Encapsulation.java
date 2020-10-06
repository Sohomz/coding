//Encapsulation -> Binding data with methods , we can access the data through method ,
// even we can do it without method , but is not the rule of encapsulation

class Student {
    private int Rollno;
    private String Name;

    public int getRollno() {
        return Rollno;
    }

    public void setRollno(int Rollno) {
        this.Rollno = Rollno;
    }

    public String getname() {
        return Name;
    }

    public void setname(String Name) {
        this.Name = Name;
    }

}

public class Encapsulation {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setRollno(20);// access through method
        s1.setname("Navin");// access through method
        System.out.println(s1.getRollno());// access through method
        System.out.println(s1.getname());// access through method

    }
}
