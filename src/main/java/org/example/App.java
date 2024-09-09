package org.example;


import java.util.Scanner;

public class App
{

    public static void main( String[] args ) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        service services=new service();
        int choice=0;
        while(choice!=7) {
            System.out.println(" \n 1.Add data \n 2.Get Data \n 3.Change Driver \n 4.Get All data\n 5.delete data \n 6.Update Truck \n 7.exit");
            choice=sc.nextInt();
             switch (choice) {
                 case 1:
                     System.out.println("Enter the Truck name");
                     String name=sc.next();
                     System.out.println("Enter the capacity");
                     int capacity=sc.nextInt();
                     System.out.println("Enter the model");
                     String model=sc.next();
                     System.out.println("Enter the driver name");
                     String driver=sc.next();
                     Truck truck=new Truck(name,model,capacity,driver);
                     services.addData(truck);
                     System.out.println("Data added Successfully...........");
                     Thread.sleep(2000);
                     break;

                 case 2:
                     System.out.println("Enter the Id when data is get");
                     int id=sc.nextInt();
                     services.getData(id);
                     Thread.sleep(2000);
                     break;

                 case 3:
                     System.out.println("Enter the id which driver is changed");
                     id=sc.nextInt();
                     System.out.println("Enter the driver name");
                     String dname=sc.next();
                     services.changeDriver(dname,id);
                     System.out.println("Driver changed successfully.........");
                     Thread.sleep(2000);
                     break;

                 case 4:
                     services.getAllData();
                     Thread.sleep(2000);
                     break;

                 case 5:
                     System.out.println("Enter the id which truck data are removed");
                     id=sc.nextInt();
                     services.deleteData(id);
                     System.out.println("Data removed successfully............");
                     Thread.sleep(2000);
                     break;
                 case 6:
                     System.out.println("Enter the id which truck is changed");
                     id=sc.nextInt();
                     System.out.println("Enter the Truck name");
                      name=sc.next();
                     System.out.println("Enter the capacity");
                     capacity=sc.nextInt();
                     System.out.println("Enter the model");
                     model=sc.next();
                     System.out.println("Enter the driver name");
                     driver=sc.next();
                     truck=new Truck(name,model,capacity,driver);
                     truck.setId(id);
                     TruckService truckService=new TruckService();
                     truckService.updateTruck(truck);
                     System.out.println("Data updated Successfully");
                     break;

                 case 7:
                     System.exit(0);


                 default:
                     System.out.println("Enter valid choice");
           }
       }
    }
}
