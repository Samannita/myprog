package com.cg.colection.practice;

public class Car {
	private String regNo;
	private int price;

	public Car(String regNo,int price) {
		this.regNo = regNo;
		this.price=price;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + price;
		result = prime * result + ((regNo == null) ? 0 : regNo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		
		if (price != other.price)
			return false;
		if (regNo == null) {
			if (other.regNo != null)
				return false;
		} else if (!regNo.equals(other.regNo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return regNo;
	}
	
	
	public int compareTo(Car o) {
		if(this.getPrice()>o.getPrice())
			return 1;
		else
			return -1;
	}
	
	

}
