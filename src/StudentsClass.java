import java.util.ArrayList;
import java.util.List;

public class StudentsClass {
  private int classesWatched;
  private List<Student> students = new ArrayList<>();

  public int getClassesWatched() {
    return this.classesWatched;
  }

  public List<Student> getStudents() {
    return this.students;
  }

  public void enrollStudent(Student student) {
    students.add(student);
  }

  public void watchClass() {
    this.classesWatched += 1;
  }
}
