package Person;

public class Student extends Person {
    private int aar;
    private int course;

    public static final int computer_science = 1;
    public static final int physics = 2;
    public static final int biology = 3;
    public static final int history = 4;

    Student() {
        super();

        aar = 0;
        course = 0;

    }

    Student(String name, String address, String phoneNr, String email, int aar, int course) {
        super(name, address, phoneNr, email);
        setAar(aar);
        setCourse(course);
    }

    public int getAar() {
        return this.aar;
    }

    public void setAar(int aar) {
        this.aar = aar;
    }

    public int getCourse() {
        return this.course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    private String getCourseAsString(int course) {
        switch (course) {
            case 1:
                return String.format("Computer Science");

            case 2:
                return String.format("Physics");

            case 3:
                return String.format("Biology");

            case 4:
                return String.format("History");

            default:
                return String.format("Unspecified");

        }
    }

    @Override
    public String toString() {
        return String.format("Student%nYear: %d%nCourse: %s%n" + super.toString(), getAar(), getCourseAsString(getCourse()));
    }
}
