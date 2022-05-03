package resourse;

public class CapacityResource {
	public int capacity = 500;
	public boolean incDec;



	public CapacityResource(int capacity) {
		super();
		this.capacity = capacity;
		
	}


	public boolean incrementsDecrements (boolean incDec)
	    {
	        return incDec ;
	    }

	@Override
	public String toString() {
		return "CapacityResource [capacity=" + capacity + "]";
	}


	
	 
}
