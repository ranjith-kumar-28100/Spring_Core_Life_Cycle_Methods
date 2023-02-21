package inc.codeman.spring.springcore.lc.ticketreservation.exercise;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class Ticket {
	private int ticketNo;
	private int ticketCost;
	
	
	public int getTicketNo() {
		return ticketNo;
	}

	public void setTicketNo(int ticketNo) {
		System.out.println("Setting the Ticket No");
		this.ticketNo = ticketNo;
	}

	public int getTicketCost() {
		return ticketCost;
	}

	public void setTicketCost(int ticketCost) {
		System.out.println("Setting the Ticket Cost");
		this.ticketCost = ticketCost;
	}

	
	@Override
	public String toString() {
		return "Ticket [ticketNo=" + ticketNo + ", ticketCost=" + ticketCost + "]";
	}

	@PostConstruct
	public void initialize() {
		System.out.println("Inside initialize method");
	}

	@PreDestroy
	public void cleanUp() {
		System.out.println("Inside cleanUp method");
	}

}
