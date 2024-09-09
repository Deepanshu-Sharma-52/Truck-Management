package org.example;

import java.util.List;

public class service {
    TruckService truckService=new TruckService();
    public  void addData(Truck truck) {
        truckService.addTruck(truck);
    }
    public void getData(int id){
        Truck truck=truckService.getTruckById(id);
        System.out.println("Truck data : "+truck);
    }
    public void changeDriver(String name,int id){
        Truck truck=truckService.getTruckById(id);
        truck.setDriverName(name);
        truckService.updateTruck(truck);
        System.out.println("Updated truck data : "+truckService.getTruckById(id));
    }
    public  void getAllData(){
        List<Truck> allTrucks=truckService.getAllTrucks();
        System.out.println("All trucks:");
        for(Truck truck1:allTrucks){
            System.out.println(truck1);
        }
    }
    public  void deleteData(int id){
        truckService.deleteTruck(id);
        System.out.println("Data deleted by id:"+id);
    }
}
