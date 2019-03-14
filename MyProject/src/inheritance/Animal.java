package inheritance;

public class Animal {
	
	private boolean Vegetarian;
	
	private String eats;
	
	private int noOfLegs;
	
	public Animal(boolean veg, String food, int legs) {
		
		this.setVegetarian(veg);
		this.eats = food;
		this.setNoOfLegs(legs);
		
		
		
	}


	public int getnoOfLegs() {
		return getnoOfLegs();
	}
	

public boolean isVegetarian() {
	 return Vegetarian;
	 
 }

  public String getEats() {
	  return eats;
	  
  }

public void setNoOfLegs(int noOfLegs) {
	this.noOfLegs = noOfLegs;
}

public void setVegetarian(boolean vegetarian) {
	vegetarian = vegetarian;
}

}


