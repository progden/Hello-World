package models ;
import paly.* ;
import play.db.jpa.*;

import javax.persistance.*;
import java.util.*;

@javax.persistence.Entity
public class Friendship extends Model{
		public int fbid1 ;
		public int fbid2 ;
		public Friendship(int a, int b){
			this.fbid1 = Math.min(a,b);
			this.fbid2 = Math.max(a,b);
		}
}