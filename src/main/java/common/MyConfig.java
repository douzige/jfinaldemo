package common;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.core.JFinal;
import com.jfinal.template.Engine;

import Routes.AdminRoute;
import Routes.FrontRoute;

public class MyConfig extends JFinalConfig{

	@Override
	public void configConstant(Constants me) {
		// TODO Auto-generated method stub
		//设置成开发模式
		me.setDevMode(true);
		
	}

	@Override
	public void configEngine(Engine arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configHandler(Handlers arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configInterceptor(Interceptors arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configPlugin(Plugins arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configRoute(Routes me) {
		// TODO Auto-generated method stub
		me.add(new FrontRoute());
		me.add(new AdminRoute());

		
	}
	public static void main(String[] args) {
		
		JFinal.start("src/main/webapp",8080,"/",5);
		
//		PropKit
	}

	/*@Override
	public void afterJFinalStart() {
		// TODO Auto-generated method stub
		super.afterJFinalStart();
	}*/

	
}
