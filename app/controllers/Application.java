package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {
	public static int countor = 1 ;
    public static void index() {
		List users = User.find("order by id desc").fetch();
		render(users);
    }
	public static void sayHello(String name){
		render(name);
	}
	public static void addUser(String fbid, String name){
		User u = new User(fbid, name).save();
		renderJSON(u);
	}
}