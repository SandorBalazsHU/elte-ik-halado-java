package gyak02;

enum City {
    BUDAPEST(1118),
    KALOCSA(6300),
    KISKUNHALAS(6400),
	BUDAPEST2(BUDAPEST);
	
    private int zipCode;
    
    City(int zipCode) {
    	this.zipCode = zipCode;
    }
    
    City(City city) {
    	this.zipCode = city.getZipCode();
    }
    
    public int getZipCode() {
    	return this.zipCode;
    }
    
	public String toString() {
		return this.name()+" ("+this.zipCode+")";
	}
  }
