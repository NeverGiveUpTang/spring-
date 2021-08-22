package extension.init.property.setProperties;

import extension.test.Address;
import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.stereotype.Component;

/**
 * @author TangWei
 * @date 2021/5/30
 */
@Component
public class MyCustomPropertyEditorRegistrar implements PropertyEditorRegistrar {
	@Override
	public void registerCustomEditors(PropertyEditorRegistry registry) {
		registry.registerCustomEditor(Address.class, new MyCustomPropertyEditorSupport());

		System.out.println("我被注册了");
	}
}
