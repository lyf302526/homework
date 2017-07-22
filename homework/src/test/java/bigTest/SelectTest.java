package bigTest;

import javax.annotation.Resource;

import org.big.mapper.GoodsMapper;
import org.big.service.GoodsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:/WEB-INF/applicationContext.xml","classpath*:/WEB-INF/spring-config.xml"})
public class SelectTest {
	@Resource
    private GoodsMapper goodsMapper;
	//@Test
	//public void select{
		
	}
		
//}
