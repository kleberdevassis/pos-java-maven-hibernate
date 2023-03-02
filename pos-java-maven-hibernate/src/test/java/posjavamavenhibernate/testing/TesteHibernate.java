package posjavamavenhibernate.testing;

import org.junit.Test;

import dao.DaoGeneric;
import model.UsuarioPessoa;
import posjavamavenhibernate.HibernateUtil;

public class TesteHibernate {
	
	@Test
	public void testeHibernateUtil() {
		DaoGeneric<UsuarioPessoa> daoGeneric = new DaoGeneric<UsuarioPessoa>();
		
		UsuarioPessoa pessoa = new UsuarioPessoa();
		
		pessoa.setIdade(45);
		pessoa.setLogin("binho");
		pessoa.setNome("kleber");
		pessoa.setSenha("sdfwe");
		pessoa.setSobrenome("margarido");
		pessoa.setEmail("passou@gmail.com");
		
		daoGeneric.salvar(pessoa);
	}

}
