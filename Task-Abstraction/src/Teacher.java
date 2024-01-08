public class Teacher extends Person {
    private String subject;
    private String school;

    public Teacher(String name, String subject, String school) {
        super(name);
        this.subject = subject;
        this.school = school;
    }

    @Override
    void describeRole() {
        System.out.println("Teacher name: " + getName() + "\n" + "Teachers at: " + school + "\n"
                + "The subject for the teacher is: " + subject);

    }

    void describeCV() {
        System.out.println("\n" + getName() + " is Graduated from KCST and got Bachelor in Computer Engineering.");
    }
}
