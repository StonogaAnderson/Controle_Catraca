package Screen;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import resourse.CapacityResource;
import resourse.TicketGateTask;


public class MainScreen {

	public static void main(String[] args) {

		CapacityResource capacityResource = new CapacityResource(0);
		
		TicketGateTask gateA = new TicketGateTask(522, capacityResource , "gateA");
		TicketGateTask gateB = new TicketGateTask(250, capacityResource , "gateB");
		TicketGateTask gateC = new TicketGateTask(250, capacityResource, "gateC");
		TicketGateTask gateD = new TicketGateTask(250, capacityResource ,"gateD");
		
		System.out.println(gateA.peopleRate);
		
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
