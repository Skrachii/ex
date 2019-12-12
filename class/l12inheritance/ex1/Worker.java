package l12inheritance.ex1;

public class Worker extends Person{

    private double workHours;
    private double dailyWage;

    public Worker(String firstName, String familyName ,
                  double workHours , double dailyWage) {
        super(firstName, familyName);
        this.workHours = workHours;
        this.dailyWage = dailyWage;
    }

    @Override
    public String personalDetails() {
        return String.format("%s; Work Hours %.2f ; Daily Wage %.2f; " +
                        "Hourly Wage %.2f",
                super.personalDetails(), workHours , dailyWage,
                getHourlyWage());
    }

    public double getHourlyWage(){
        return dailyWage/workHours;
    }

    public double getWorkHours() {
        return workHours;
    }

    public void setWorkHours(double workHours) {
        this.workHours = workHours;
    }

    public double getDailyWage() {
        return dailyWage;
    }

    public void setDailyWage(double dailyWage) {
        this.dailyWage = dailyWage;
    }
}
