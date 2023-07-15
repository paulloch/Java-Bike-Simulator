import java.util.Random;

public class Driver {

        public Driver(int sleepiness, int miles, boolean accident) {
        this.miles = miles;
        this.accident = accident;
    }
        private int miles;
        private int sleepiness;
        private boolean accident;
        
        public void driveAllDay(){
            miles = miles + 1000;
            sleepiness = sleepiness + 60;
            setMiles(miles);
            setSleepiness(sleepiness);
        }

        public void driveHalfDay(){
            miles = miles + 500;
            sleepiness = sleepiness + 30;
            setMiles(miles);
            setSleepiness(sleepiness);
        }      
      
        public void sleepAllDay(){
            sleepiness = sleepiness -60;
            setSleepiness(sleepiness);
        }

        public void accident(){
            Random rand = new Random();
            int upperbound  = 5;
            int int_random = rand.nextInt(upperbound);
            if ((int_random*sleepiness) > 100) {
            accident = true;
            } 

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
        public boolean isAccident() {
            return accident;
        }
        public void setAccident(boolean accident) {
            this.accident = accident;
        }


}



