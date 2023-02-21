package inc.codeman.spring.springcore.lc.ticketreservation.exercise;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("inc/codeman/spring/springcore/lc/ticketreservation/exercise/config.xml");
		Ticket ticket =(Ticket) context.getBean("ticket");
		System.out.println(ticket);
		context.registerShutdownHook();		
		}
}
