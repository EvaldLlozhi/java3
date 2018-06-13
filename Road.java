//lozi ebalnt 
// a.m 1074import java.util.LinkedList;


public class Road {
    
    private City start;
    private City end;
    private int distance;
    private LinkedList<Car> cars;

    public Road(City start, City end, int distance) {
        this.start = start;
        this.end = end;
        this.distance = distance;
        this.cars = new LinkedList<Car>();
    }
    
    public double computeAggregateTravelTime(){
        if(cars.size()==0){
            return 0;
        }
        double u = 0;
        for(Car c: cars){
            u+=c.getTimePerKlm();
        }
        return u/cars.size();
    }
    
    public void moveCars(){
        for(Car c: cars){
            c.setTimeToGo(c.getTimeToGo()-1);
        }
        
        int to=0;
        
        for(int i=0;i<cars.size();i++){
            if(cars.get(i).getTimeToGo() <= 0){
                end.addCar(cars.get(i));
                to ++;
            }else{  
                break;
            }
        }
        
        for(int i=0;i<to;i++){
            cars.removeFirst();
        }
        
    }
    
    public void addCar(Car c){
        c.setTimeToGo(distance*c.getTimePerKlm());
        cars.addLast(c);
    }
    
    public void print(){
        System.out.println("From: "+start.getId()+" to "+end.getId());
        System.out.println(cars.toString());
    }
    
    
    
}
