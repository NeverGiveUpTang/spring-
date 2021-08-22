package extension.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author TangWei
 * @date 2021/5/30
 */
@Component
public class PropertyMode {

	@Value("${name}")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "PropertyMode{" +
				"name='" + name + '\'' +
				'}';
	}
}
