package Routes;

import com.jfinal.config.Routes;

import controller.AdminController;
import interceptor.AdminInterceptor;

public class AdminRoute extends Routes{

	@Override
	public void config() {
		addInterceptor(new AdminInterceptor());
		setBaseViewPath("/WEB-INF");
		add("/admin",AdminController.class);
		
	}

}
