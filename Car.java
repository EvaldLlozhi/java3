//lozi ebalnt 
// a.m 1074public class Car {
    
    private int timePerKlm;
    private int timeToGo;

    public Car(int timePerKlm) {
        this.timePerKlm = timePerKlm;
        this.timeToGo = 0;
    }

    public int getTimeToGo() {
        return timeToGo;
    }

    public void setTimeToGo(int timeToGo) {
        this.timeToGo = timeToGo;
    }

    public int getTimePerKlm() {
        return timePerKlm;
    }
    
    

    public String toString() {
        return "Car{" + "timePerKlm=" + timePerKlm + ", timeToGo=" + timeToGo + '}';
    }

    
    
    
    
}
