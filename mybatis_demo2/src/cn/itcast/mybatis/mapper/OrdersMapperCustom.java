package cn.itcast.mybatis.mapper;

import java.util.List;

import cn.itcast.mybatis.po.OrderCustom;
import cn.itcast.mybatis.po.Orders;
import cn.itcast.mybatis.po.User;

/**
 * 
 * <p>
 * Title: OrdersMapperCustom
 * </p>
 * <p>
 * Description:订单自定义mapper接口
 * </p>
 * <p>
 * Company: www.itcast.com
 * </p>
 * 
 * @author 传智.燕青
 * @date 2015-3-19上午9:54:57
 * @version 1.0
 */
public interface OrdersMapperCustom {
	// 一对一查询，查询订单关联查询用户，使用resultType
	public List<OrderCustom> findOrderUserList() throws Exception;

	// 一对一查询，使用resultMap
	public List<Orders> findOrderUserListResultMap() throws Exception;
	//一对一查询，延迟加载
	public List<Orders> findOrderUserListLazyLoading() throws Exception;

	// 一对多查询，使用resultMap
	public List<Orders> findOrderAndOrderDetails() throws Exception;
	
	// 一对多查询，使用resultMap
	public List<User> findUserOrderDetail() throws Exception;
}
