package dao;

import org.springframework.stereotype.Component;

/**
 * @author TangWei
 * @date 2021/5/30
 */
@Component
public class TestDao {
	public TestDao() {
		System.out.println("我被实例化了，TestDao");
	}
}
