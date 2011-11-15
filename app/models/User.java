package models ;
import paly.* ;
import play.db.jpa.*;

import javax.persistance.*;
import java.util.*;

@javax.persistence.Entity
public class User extends Model{
	public String fbid ;
	public String name;
	public String first_name ;
	public String last_name ;
	public String link ;
	public String username ;
	public String bio ;
	public String gender ;
	public String timezone ;
	public String locale ;
	public String verified ;
	public String date ;
	public User(String id, String name){
		this.fbid = id ; 
		this.name = name ;
	}
}