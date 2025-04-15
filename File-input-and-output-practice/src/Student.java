public class Student {
    private String firstname;;

    public Student(String firstname) {
        this.firstname = firstname;

    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Override
    public String toString() {
        return
               "firstname:" + firstname ;
    }
}