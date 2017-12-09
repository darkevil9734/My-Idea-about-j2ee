package Test_Case;

import static org.junit.Assert.*;

import javax.ejb.EJB;
import javax.ejb.EJBs;

import org.junit.Before;
import org.junit.Test;

import SessionBeans.UserDAOLocal;


public class Test_User {
	@EJB
	private UserDAOLocal u;
	
	
	@Test
	public void size() {
		int dk = u.dang_ky("admin1", "admin1", "nguyen");
		//assertTrue(dk!=0);
	}
}
