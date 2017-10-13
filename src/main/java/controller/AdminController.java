package controller;

import com.jfinal.core.Controller;

public class AdminController extends Controller{
	
	public void index() {
		setAttr("msg", "hello mmp");
		renderTemplate("index.html");
	}

}
