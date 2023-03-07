package posjavamavenhibernate.testing;

import org.junit.Test;

import dao.DaoGeneric;
import model.UsuarioPessoa;

public class TesteHibernate {
	
	@Test
	public void testeHibernateUtil() {
		DaoGeneric<UsuarioPessoa> daoGeneric = new DaoGeneric<UsuarioPessoa>();
		
		UsuarioPessoa pessoa = new UsuarioPessoa();
		
		pessoa.setIdade(33);
		pessoa.setLogin("kleber");
		pessoa.setNome("klebe");
		pessoa.setSenha("kle");
		pessoa.setSobrenome("kleber");
		pessoa.setEmail("faofou@gmail.com");
		
		daoGeneric.salvar(pessoa);
	}
	
    @Test
	public void testeBuscar() {
		DaoGeneric<UsuarioPessoa> daoGeneric = new DaoGeneric<UsuarioPessoa>();
		
		UsuarioPessoa pessoa = new  UsuarioPessoa();
		pessoa.setId(1L);
		
		
		pessoa = daoGeneric.pesquisar(pessoa);
		
		System.out.println(pessoa);
		
	}
	@Test
	public void testeBuscar2() {
		DaoGeneric<UsuarioPessoa> daoGeneric = new DaoGeneric<UsuarioPessoa>();
		
		
		UsuarioPessoa pessoa= daoGeneric.pesquisar(1L, UsuarioPessoa.class);
		
		System.out.println(pessoa);
		
	}
	@Test
	public void testUpdate() {
		DaoGeneric<UsuarioPessoa> daoGeneric = new DaoGeneric<UsuarioPessoa>();
		
		UsuarioPessoa pessoa= daoGeneric.pesquisar(1L, UsuarioPessoa.class);
		
		pessoa.setIdade(99);
		pessoa.setNome("nome atualizado2");
		
		pessoa = daoGeneric.updateMerge(pessoa);
		
		System.out.println(pessoa);
		
	}

}
