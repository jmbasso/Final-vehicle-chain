package csc164_final_vechicle_class_chain;
import java.util.*;
import java.util.UUID;

 class vechicle_class_chain {
	public static void main(String[] args) {
	class Person {
			  public String Firstname;
			  public String Lastname;
			  UUID personid;
			 public UUID getId(){
				 return personid;
			 }

		}
	 abstract class Vehicle{
		 public String Name;
		  public String Color;
		  public String Weight;
		  Person Owner;
		  void transferOwnership(Person newOwner){
			  
		  }
	
	 }
	
	 class Car extends Vehicle {
		   int numberOfDoors;	  
		}
	 class Truck extends Vehicle {
		   int numberOfAxles;
		}
	 class Motorcycle extends Vehicle {
		   boolean hasSidecar;

		}
	
	 Vehicle myVehicle = new Car();
	 Car myCar = new Car();
	 
	class TestVehicle{
		Person a=new Person();
		Car c1=new Car();
		Truck t=new Truck();
		Person b=new Person();
		Motorcycle m= new Motorcycle();
	} 
	if (myVehicle instanceof Car) {
		   System.out.println("Type of vehicle:  Car");
		   Car c;
		   c = (Car)myVehicle;  // Type-cast to get access to numberOfDoors!
		   System.out.println("Number of doors:  " + c.numberOfDoors);
		}
		else if (myVehicle instanceof Truck) {
		   System.out.println("Type of vehicle:  Truck");
		   Truck t;
		   t = (Truck)myVehicle;  // Type-cast to get access to numberOfAxles!
		   System.out.println("Number of axles:  " + t.numberOfAxles);
		}
		else if (myVehicle instanceof Motorcycle) {
		   System.out.println("Type of vehicle:  Motorcycle");
		   Motorcycle m;
		   m = (Motorcycle)myVehicle;  // Type-cast to get access to hasSidecar!
		   System.out.println("Has a sidecar:    " + m.hasSidecar);
		}
	
	}
	
	}
	