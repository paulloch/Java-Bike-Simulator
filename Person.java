import java.util.Random;

public class Person {

    private int miles;
    private int sleepiness;
    private boolean accident;
    int x;

    public Person(int sleepiness, int miles, boolean accident) {
        this.sleepiness = sleepiness;
        this.miles = miles;
        this.accident = accident;
    }

    public boolean isAccident() {
        return accident;
    }

    public void setAccident(boolean accident) {
        this.accident = accident;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public int getSleepiness() {
        return sleepiness;
    }

    public void setSleepiness(int sleepiness) {
        this.sleepiness = sleepiness;
    }

    public void driveAllDay() {
        miles = miles + 400;
        sleepiness = sleepiness + 80;
        if (sleepiness > 100) {
            sleepiness = 95;
        }
        x=0;
        accident();
        setMiles(miles);
        setSleepiness(sleepiness);
        setAccident(accident);
    }

    public void driveHalfDay() {
        miles = miles + 250;
        sleepiness = sleepiness + 40;
        if (sleepiness > 100) {
            sleepiness = 95;
        }
        x=30;
        accident();
        setMiles(miles);
        setSleepiness(sleepiness);
        setAccident(accident);
    }

    public void sleepAllDay() {
        sleepiness = sleepiness - 60;
        if (sleepiness < 0) {
            sleepiness = 0;
        }
        setSleepiness(sleepiness);
    }

    public void accident() {
        Random rand = new Random();
        int upper = 100;
        int int_random = rand.nextInt(upper);
        if (int_random + sleepiness + x > 160){accident = true;}
        setAccident(accident);
        }

    }


