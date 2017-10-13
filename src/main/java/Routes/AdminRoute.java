package Routes;

import com.jfinal.config.Routes;

import controller.AdminController;

public class AdminRoute extends Routes{

	@Override
	public void config() {
		setBaseViewPath("/WEB-INF");
		add("/admin",AdminController.class);
		
	}

}
