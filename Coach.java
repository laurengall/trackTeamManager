public class Coach extends Person {
    private int yearsExp;
    private String specialty;

    public Coach(String name) {
        super(name);
        this.yearsExp = yearsExp;
        this.specialty = specialty;
    }

    public int getYearsExp() {
        return yearsExp;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setYearsExp() {
        this.yearsExp = yearsExp;
    }

    public void setSpecialty() {
        this.specialty = specialty;
    }
}