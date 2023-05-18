import java.util.ArrayList;

public class Athlete extends Person {
  private int age;
  private int grade;
  private ArrayList<String> events = new ArrayList<String>();

  public Athlete(String name) {
    super(name);
    this.age = age;
    this.grade = grade;
    this.events = events;
  }

  public Athlete(String name, int a, int g, ArrayList<String> e) {
    super(name);
    age = a;
    grade = g;
    events = e;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getGrade() {
    return grade;
  }

  public void setGrade(int grade) {
    this.grade = grade;
  }

  public ArrayList<String> getEvents() {
    return events;
  }

  public void setEvents(ArrayList<String> events) {
    this.events = events;
  }
}