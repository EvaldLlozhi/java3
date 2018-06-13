//lozi ebalnt 
// a.m 1074import java.util.ArrayList;
import java.util.LinkedList;


public class City {
    
    private int id;
    private ArrayList<Road> roads;
    private LinkedList<Car> cars;

    public City(int id) {
        this.id = id;
        this.cars = new LinkedList<Car>();
        this.roads = new ArrayList<Road>();
    }
    
    public void addCar(Car c){
        cars.add(c);
    }
    
    public void addRoad(Road r){
        roads.add(r);
    }
    
    public void routeCars(){
        for(Car c:cars){
            int pos = 0;
            double min = 999999;
            for(int i=0;i<roads.size();i++){
                Road r = roads.get(i);
                double time = r.computeAggregateTravelTime();
                if(time<min){
                    pos=i;
                    min=r.computeAggregateTravelTime();
                }
            }
            
            roads.get(pos).addCar(c);
        }
        this.cars.clear();
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "City{" + "id=" + id + " cars=" + cars + '}';
    }
    
    public int getCarsNum(){
        return cars.size();
    }
    
    
}
