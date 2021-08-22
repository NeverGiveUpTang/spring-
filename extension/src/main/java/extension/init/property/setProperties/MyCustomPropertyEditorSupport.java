package extension.init.property.setProperties;

import extension.test.Address;

import java.beans.PropertyEditorSupport;

/**
 * @author TangWei
 * @date 2021/5/30
 */
public class MyCustomPropertyEditorSupport extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String[] split = text.split("-");

		Address address = new Address();

		address.setProvince(split[0]);

		address.setCity(split[1]);

		setValue(address);
	}
}
