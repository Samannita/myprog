package com.cg.colection.practice;
import java.util.ArrayList;
import java.util.Iterator;
public class CarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Car> car = new ArrayList<Car>();
		Car c= new Car("as123", 0);
		car.add(c);
		for(int i=0;i<5;i++)
			car.add(new Car("as" +i, i));
		
		car.add(3,new Car("as369", 0));
		
		
		Iterator<Car> it = car.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
//		System.out.println("array size is:" +car.size());
//		
//		ArrayList<Car> car2 = (ArrayList<Car>)car.clone();
//
//		Iterator<Car> it2 = car.iterator();
//		System.out.println("After cloning---\n");
//		while(it2.hasNext()) {
//			System.out.println(it2.next());
//			
//			
//		}
//		System.out.println(car.contains(new Car("as369")));

		for(int i=0,n=car.size();i<n;i++)
			System.out.println(n);
	}

}
