package extension.app;

import extension.cnfig.StartupConfiguration;
import extension.init.property.addProperties.MyCustomAnnotationConfigApplicationContext;
import extension.test.Person;
import extension.test.PropertyMode;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author TangWei
 * @date 2021/5/30
 */
public class App {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new MyCustomAnnotationConfigApplicationContext(StartupConfiguration.class);

		PropertyMode p = applicationContext.getBean(PropertyMode.class);

		System.out.println(p);

		Person person = applicationContext.getBean(Person.class);

		System.out.println(person);
	}
}
