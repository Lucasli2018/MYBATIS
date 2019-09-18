package cn.itcast.mybatis.po;

import java.util.List;

/**
 * 
 * <p>Title: UserQueryVo</p>
 * <p>Description:包装类型，将来在使用时从页面传到controller、service、mapper </p>
 * <p>Company: www.itcast.com</p> 
 * @author	传智.燕青
 * @date	2015-3-17下午4:30:39
 * @version 1.0
 */
public class UserQueryVo {
	
	//用户信息
	private User user;
	
	//自定义user的扩展对象
	private UserCustom userCustom;
	
	//用户id集合
	private List<Integer> ids;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserCustom getUserCustom() {
		return userCustom;
	}

	public void setUserCustom(UserCustom userCustom) {
		this.userCustom = userCustom;
	}

	public List<Integer> getIds() {
		return ids;
	}

	public void setIds(List<Integer> ids) {
		this.ids = ids;
	}
	
	
	
	
}
