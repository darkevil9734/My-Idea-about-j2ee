package SessionBeans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import EntityBeans.User;

@Stateless
public class UserDAO implements UserDAOLocal {
    @PersistenceContext
    EntityManager em;
	public UserDAO() {

    }

	@Override
	public User dang_nhap(String username, String password) {
		Query q = em.createNamedQuery("User.Login", User.class);
		q.setParameter("username", username);
		q.setParameter("password", password);
		
		return (User) q.getSingleResult();
	}

}
