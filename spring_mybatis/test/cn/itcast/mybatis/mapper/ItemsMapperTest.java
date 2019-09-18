package cn.itcast.mybatis.mapper;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.mybatis.po.Items;
import cn.itcast.mybatis.po.ItemsExample;

public class ItemsMapperTest {

	private ApplicationContext applicationContext;

	private ItemsMapper itemsMapper;

	@Before
	public void setUp() throws Exception {
		// 创建spring容器

		applicationContext = new ClassPathXmlApplicationContext(
				"spring/applicationContext.xml");
		itemsMapper = (ItemsMapper) applicationContext.getBean("itemsMapper");

	}

	// 根据主键删除
	@Test
	public void testDeleteByPrimaryKey() {
		itemsMapper.deleteByPrimaryKey(4);
		// 自定义条件删除
		// itemsMapper.deleteByExample(example)
	}

	@Test
	public void testInsert() {

		Items items = new Items();
		items.setName("手机");
		items.setPrice(3000.0f);

		itemsMapper.insert(items);
	}

	// 自定义条件查询
	@Test
	public void testSelectByExample() {
		ItemsExample itemsExample = new ItemsExample();
		ItemsExample.Criteria criteria = itemsExample.createCriteria();
		criteria.andNameEqualTo("笔记本2");
		// criteria.andNameLike("笔记本");

		List<Items> list = itemsMapper.selectByExample(itemsExample);
		System.out.println(list);
		// 将大文本字段也查询出来
		// itemsMapper.selectByExampleWithBLOBs(example)
	}

	// 根据主键查询
	@Test
	public void testSelectByPrimaryKey() {
		Items items = itemsMapper.selectByPrimaryKey(1);
		System.out.println(items);
	}

	@Test
	public void testUpdateByPrimaryKey() {
		// 将更新对象的内容全部更新到数据库
		// updateByPrimaryKey通过是先查询再设置更新字段的值
		Items items = itemsMapper.selectByPrimaryKey(1);
		items.setName("笔记 本4");

		itemsMapper.updateByPrimaryKey(items);
		//自定义条件更新，example设置条件，record是更新对象
//		itemsMapper.updateByExample(record, example)
		//可以更新大文本字段
//		itemsMapper.updateByExampleWithBLOBs(record, example)
		

	}

	@Test
	public void testUpdateByPrimaryKeySelective() {
		// 如果更新对象的属性不为空才更新到数据库
		// 常用于指定字段更新，不用先查询出，可以直接new一个对象，此对象一定要设置id主键，再设置更新字段的值
		Items items = new Items();
		items.setId(1);
		items.setName("笔记 本5");
		itemsMapper.updateByPrimaryKeySelective(items);

	}

}
