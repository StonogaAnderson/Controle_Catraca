package resourse;


public class TicketGateTask implements Runnable {
	
	public int peopleRate = 1000/10;
	CapacityResource capacityResource;
	public String gateName;


	
	public TicketGateTask(int peopleRate, CapacityResource capacityResource, String gateName) {
		super();
		this.peopleRate = peopleRate;
		this.capacityResource = capacityResource;
		this.gateName = gateName;
	}


	public int getPeopleRate() {
		return peopleRate;
	}


	public void setPeopleRate(int peopleRate) {
		this.peopleRate = peopleRate;
	}


	public CapacityResource getCapacityResource() {
		return capacityResource;
	}


	public void setCapacityResource(CapacityResource capacityResource) {
		this.capacityResource = capacityResource;
	}


	public String getGateName() {
		return gateName;
	}


	public void setGateName(String gateName) {
		this.gateName = gateName;
	}

	@Override
	public void run() {
	while(true) {	
		//if(capacityResource.capacity <= 500) {
		if(peopleRate < 500) {
			capacityResource.incrementsDecrements(true);
			try {
			
			Thread.sleep(peopleRate);
			//System.out.println(" Capacidade "+capacityResource.capacity);
			} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
			}
		}else {
			capacityResource.incrementsDecrements(false);
			//System.out.println("Capacidade "+capacityResource.incDec+"LOTADA");
		}
	

	}
}






}




