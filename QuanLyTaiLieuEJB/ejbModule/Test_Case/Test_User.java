package Test_Case;

import static org.junit.Assert.*;

import javax.ejb.EJB;
import javax.ejb.EJBs;

import org.junit.Before;
import org.junit.Test;

import SessionBeans.UserDAOLocal;


public class Test_User {
	
	@Before
	public void prepare() {
		UserDAOLocal u = null;
		//.Func.
	}
	
	@Test
	public void size() {
		prepare();
		assertEquals(2, 2);
	}
}
