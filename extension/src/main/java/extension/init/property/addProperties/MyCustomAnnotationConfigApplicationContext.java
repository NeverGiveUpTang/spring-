package extension.init.property.addProperties;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author TangWei
 * @date 2021/5/30
 */
public class MyCustomAnnotationConfigApplicationContext extends AnnotationConfigApplicationContext {

	public MyCustomAnnotationConfigApplicationContext(Class<?>... componentClasses) {
		super(componentClasses);
	}

	@Override
	protected void initPropertySources() {
		getEnvironment().getSystemProperties().put("name", "testPro");

		getEnvironment().getSystemProperties().put("address", "zhejiang-hangzhou");
//		getEnvironment().setRequiredProperties("authName");
	}
}
