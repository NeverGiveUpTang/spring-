package extension.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author TangWei
 * @date 2021/5/30
 */
@Component
public class Person {

	@Value("${address}")
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person{" +
				"address=[province = " + address.getProvince() + ", city = " + address.getCity() + "]" +
				'}';
	}
}
