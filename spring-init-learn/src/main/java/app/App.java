package app;

import config.SpringInitLearnConfiguration;
import dao.TestDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author TangWei
 * @date 2021/5/30
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringInitLearnConfiguration.class);

		TestDao bean = applicationContext.getBean(TestDao.class);

		System.out.println(bean);
	}
}
