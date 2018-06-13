//lozi ebalnt 
// a.m 1074public class TrafficSimulation {

    
    public static void main(String[] args) {
        int N = 6;
        RoadNetwork net = new RoadNetwork(10);
        net.generateCars(N);
        net.printRoadTraffic();
        
        while(net.carsAtFinalDestination()!=N){
            System.out.println("======================");
            net.routeCarsAtCities();
            System.out.println("Cars routed");
            net.printRoadTraffic();
            
            net.moveCarsOnRoads();
            
            System.out.println("Cars moved");
            net.printRoadTraffic();
        }
    }
    
}
