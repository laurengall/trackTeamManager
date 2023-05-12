import java.util.ArrayList; 
public class Athlete {
  private String name; 
  private int age; 
  private int grade;
  private ArrayList<String> events = new ArrayList<String>(); 

  public Athlete(){
    this.name = name; 
    this.age = age;
    this.grade = grade; 
    this.events = events; 
  }
  public Athlete(String n, int a, int g, ArrayList<String> e){
    name = n; 
    age = a; 
    grade = g; 
    events = e; 
  }
  public String getName(){
    return name; 
  }
  public void setName(String name){
    this.name = name; 
  }
  public int getAge(){
    return age; 
  }
  public void setAge(int age){
    this.age = age; 
  }
  public int getGrade(){
    return grade; 
  }
  public void setGrade(int grade){
    this.grade = grade; 
  }
  public ArrayList<String> getEvents(){
    return events; 
  }
  public void setEvents(ArrayList<String> events){
    this.events = events; 
  }
}