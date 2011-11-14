package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {
	public static int countor = 1 ;
    public static void index() {
		countor++ ;
		int count = countor ;
        render(count);
    }
	public static void sayHello(String name){
		render(name);
	}
}