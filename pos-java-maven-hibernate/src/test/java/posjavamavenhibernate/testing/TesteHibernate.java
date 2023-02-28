package posjavamavenhibernate.testing;

import org.junit.Test;

import posjavamavenhibernate.HibernateUtil;

public class TesteHibernate {
	
	@Test
	public void testeHibernateUtil() {
		HibernateUtil.getEntityManager();
	}

}
