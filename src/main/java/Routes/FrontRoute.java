package Routes;

import com.jfinal.config.Routes;

import controller.IndexController;

/**"
 * q前端路由匹配值
 * @author Administrator
 *
 */
public class FrontRoute extends Routes{

	@Override
	public void config() {
		setBaseViewPath("/front");
		add("/",IndexController.class);
		
	}

	

}
