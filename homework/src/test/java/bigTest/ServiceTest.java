package bigTest;

import java.util.List;

import org.big.domain.Goods;
import org.big.service.GoodsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:/WEB-INF/applicationContext.xml","classpath*:/WEB-INF/spring-config.xml"})
public class ServiceTest {
	@Autowired
    private GoodsService goodsService;
	@Test
	public  void testGoodsController(){
    List<Goods> goods_list = goodsService.getAll();
    System.out.println(goods_list);
	}
	
	@Test
	public  void selectGoodsTest(){
		
		Goods goods=goodsService.selectGoods("2");
		System.out.println(goods);
	}
	
	
	@Test
	public void addGoodsTest(){
		Goods goods=new Goods();
		goods.setGoods_id("7");
		goods.setGoods_name("nini");
		goods.setDiscriber("hahahahaha");
		goods.setImage1("img/7.jpg");
		goods.setPrice(12.00);
		goods.setCount(11);
		goods.setSale("0");
		goodsService.addGoods(goods);
		System.out.println(goods);
		
	}

	@Test
	public void deleteGoodsTest(){
		goodsService.deleteGoods("7");
	}
}
