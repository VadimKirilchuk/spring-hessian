package ru.vkirilchuk.examples.spring.hessian.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ru.vkirilchuk.examples.spring.hessian.api.ScriptDTO;
import ru.vkirilchuk.examples.spring.hessian.api.ScriptService;

public class Main {

	/**
	 * @param args NOT USED
	 */
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/application.xml");
		ScriptService service = context.getBean(ScriptService.class);
		
		ScriptDTO script = new ScriptDTO("Groovy", "return 'Hello World'");
		Object result = service.execute(script);
		System.out.println(result);
	}

}
