package interceptor;

import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;

public class AdminInterceptor implements Interceptor{

	@Override
	public void intercept(Invocation inv) {
		// TODO Auto-generated method stub
		System.out.println("Admin---interceptor。。。");
		inv.invoke(); //非常重要  一定要调用
	}

}
