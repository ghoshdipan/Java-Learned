package methods;
class Vehicle{
	int wheels;
	Vehicle(){
		wheels=4;
	}
}

public class MyConstructor {
	
	MyConstructor(){
		System.out.println("Object is created");
	}
	
	public static void main(String[] args) {

	Vehicle car=new Vehicle();
	System.out.println(car.wheels+" wheels");
	}

}
