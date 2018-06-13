//lozi ebalnt 
// a.m 1074import java.util.ArrayList;
import java.util.Random;


public class RoadNetwork {
    
    private City [] cities;
    private ArrayList<Road> roads;

    public RoadNetwork(int citiesNum) {
        cities = new City[citiesNum];
        for(int i=0;i<citiesNum;i++){
            cities[i] = new City(i);
        }
        
        roads = new ArrayList<Road>();
        
        for(int i=0;i<citiesNum-1;i++){
            Road r = new Road(cities[i], cities[i+1], 1);
            cities[i].addRoad(r);
            roads.add(r);
        }
        
        for(int i=0;i<citiesNum-2;i++){
            Random rand = new Random();
            int max = citiesNum-1;
            int min = i+2;
            int randomNum = rand.nextInt((max - min) + 1) + min;
            
            Road r = new Road(cities[i], cities[randomNum], randomNum-i);
            cities[i].addRoad(r);
            roads.add(r);
        }
        
    }
    
    public void printRoadTraffic(){
        for(int i=0;i<cities.length;i++){
            System.out.println(cities[i].toString());
        }
        
        for(Road r: roads){
            r.print();
        }
    }
    
    public void generateCars(int N){
        for(int i=0;i<N;i++){
            Random rand = new Random();
            
            Car c = new Car(Math.abs(rand.nextInt())%10+1);
            cities[0].addCar(c);
        }
    }
    
    public void routeCarsAtCities(){
        
        
        for(int i=0;i<cities.length-1;i++){
            cities[i].routeCars();
        }
    }
    
    public void moveCarsOnRoads(){
        for(Road r:roads){
            r.moveCars();
        }
    }
    
    public int carsAtFinalDestination(){
        return cities[cities.length-1].getCarsNum();
    }
    
    
}
