package Routes;

import com.jfinal.config.Routes;

import controller.IndexController;
import interceptor.FrontInterceptor;

/**"
 * q前端路由匹配值
 * @author Administrator
 *
 */
public class FrontRoute extends Routes{

	@Override
	public void config() {
		addInterceptor(new FrontInterceptor());//路由级别拦截器interceptor
		setBaseViewPath("/front");
		add("/",IndexController.class);
	  
		
	}

	

}
