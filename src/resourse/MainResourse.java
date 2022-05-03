package resourse;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import Screen.AwtScreen;

public class MainResourse {
	
	public static void main(String[] args) {
		CapacityResource capacityResource= new CapacityResource(0);
		TicketGateTask gateA = new TicketGateTask(0, capacityResource, "gateA");
		TicketGateTask gateB = new TicketGateTask(0, capacityResource , "gateB");
		TicketGateTask gateC = new TicketGateTask(0, capacityResource, "gateC");
		TicketGateTask gateD = new TicketGateTask(0, capacityResource ,"gateD");
		
		System.out.println(gateA.capacityResource);
		
		
		ExecutorService service = Executors.newCachedThreadPool();
		service.execute(gateA);
		service.execute(gateB);
		service.execute(gateC);
		service.execute(gateD);
		service.shutdown();
		@SuppressWarnings("unused")
		AwtScreen Screen = new AwtScreen(gateA,gateB,gateC,gateD);
		

	}

}
