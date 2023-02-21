package inc.codeman.spring.springcore.lc.interfaces;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import inc.codeman.spring.springcore.lc.interfaces.Patient;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("inc/codeman/spring/springcore/lc/interfaces/config.xml");
		Patient patient =(Patient) context.getBean("patient");
		System.out.println(patient);
		context.registerShutdownHook();
		}
}
