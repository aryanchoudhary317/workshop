import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Base Teacher class
class Teacher {
    private String name;
    private int age;
    private Date joinDate;

    public Teacher(String name, int age, Date joinDate) {
        this.name = name;
        this.age = age;
        this.joinDate = joinDate;
    }

    public String getName() {
        return name;
    }

    public Date getJoinDate() {
        return joinDate;
    }
}

// Subject interface
interface Subject {
    List<String> taughtBy();
    int totalTeachers();
    Date startDate();
}

// Maths class implementing Subject interface
class Maths implements Subject {
    private List<Teacher> teachers = new ArrayList<>();

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    @Override
    public List<String> taughtBy() {
        List<String> teacherNames = new ArrayList<>();
        for (Teacher teacher : teachers) {
            teacherNames.add(teacher.getName());
        }
        return teacherNames;
    }

    @Override
    public int totalTeachers() {
        return teachers.size();
    }

    @Override
    public Date startDate() {
        if (teachers.isEmpty()) {
            return null;
        }
        Date earliestDate = teachers.get(0).getJoinDate();
        for (Teacher teacher : teachers) {
            if (teacher.getJoinDate().before(earliestDate)) {
                earliestDate = teacher.getJoinDate();
            }
        }
        return earliestDate;
    }
}

// Physics class implementing Subject interface
class Physics implements Subject {
    private List<Teacher> teachers = new ArrayList<>();

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    @Override
    public List<String> taughtBy() {
        List<String> teacherNames = new ArrayList<>();
        for (Teacher teacher : teachers) {
            teacherNames.add(teacher.getName());
        }
        return teacherNames;
    }

    @Override
    public int totalTeachers() {
        return teachers.size();
    }

    @Override
    public Date startDate() {
        if (teachers.isEmpty()) {
            return null;
        }
        Date earliestDate = teachers.get(0).getJoinDate();
        for (Teacher teacher : teachers) {
            if (teacher.getJoinDate().before(earliestDate)) {
                earliestDate = teacher.getJoinDate();
            }
        }
        return earliestDate;
    }
}

// Chemistry class implementing Subject interface
class Chemistry implements Subject {
    private List<Teacher> teachers = new ArrayList<>();

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    @Override
    public List<String> taughtBy() {
        List<String> teacherNames = new ArrayList<>();
        for (Teacher teacher : teachers) {
            teacherNames.add(teacher.getName());
        }
        return teacherNames;
    }

    @Override
    public int totalTeachers() {
        return teachers.size();
    }

    @Override
    public Date startDate() {
        if (teachers.isEmpty()) {
            return null;
        }
        Date earliestDate = teachers.get(0).getJoinDate();
        for (Teacher teacher : teachers) {
            if (teacher.getJoinDate().before(earliestDate)) {
                earliestDate = teacher.getJoinDate();
            }
        }
        return earliestDate;
    }
}

// SchoolManager class
class SchoolManager {
    private Maths maths = new Maths();
    private Physics physics = new Physics();
    private Chemistry chemistry = new Chemistry();

    public void addTeacherToMaths(Teacher teacher) {
        maths.addTeacher(teacher);
    }

    public void addTeacherToPhysics(Teacher teacher) {
        physics.addTeacher(teacher);
    }

    public void addTeacherToChemistry(Teacher teacher) {
        chemistry.addTeacher(teacher);
    }

    public void printSubjectDetails() {
        System.out.println("Maths:");
        System.out.println("Total Teachers: " + maths.totalTeachers());
               System.out.println("Start Date: " + maths.startDate());
        System.out.println("Teachers: " + maths.taughtBy());

        System.out.println("Physics:");
     System.out.println("Total Teachers: " + physics.totalTeachers());
          System.out.println("Start Date: " + physics.startDate());
         System.out.println("Teachers: " + physics.taughtBy());

          System.out.println("Chemistry:");
         System.out.println("Total Teachers: " + chemistry.totalTeachers());
        System.out.println("Start Date: " + chemistry.startDate());
           System.out.println("Teachers: " + chemistry.taughtBy());
    } 

    public static void main(String[] args) {
        SchoolManager manager = new SchoolManager();

        Teacher teacher1 = new Teacher("Alice", 30, new Date(120, 1, 1)); // Date(year, month, day)
        Teacher teacher2 = new Teacher("Bob", 35, new Date(119, 1, 1));
        Teacher teacher3 = new Teacher("Charlie", 40, new Date(118, 1, 1));

        manager.addTeacherToMaths(teacher1);
        manager.addTeacherToPhysics(teacher2);
        manager.addTeacherToChemistry(teacher3);

        manager.printSubjectDetails();
    }
}