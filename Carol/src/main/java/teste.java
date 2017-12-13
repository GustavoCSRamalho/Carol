import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.site.dao.BancoDAO;
import com.site.infra.CriadorDeSession;
import com.site.infra.HibernateUtil;
import com.site.modelos.Conteudo;
import com.site.modelos.DadosUsuario;
import com.site.modelos.Teste;


public class teste {
	private static Session session;
	

	public static void main(String[] args) {
		
		 Teste t= null;
//		 t.setConteudo("uhuu");
//		 session = HibernateUtil.getSessionFactory().openSession();
		 session = CriadorDeSession.getSession();
//		 session.beginTransaction();
////		 session.save(t);
////		 session.getTransaction().commit();
//		 session.createQuery("delete from com.site.modelos.DadosUsuario where id = "+"19").executeUpdate();
//		 session.getTransaction().commit();
//		 List<Teste> lista = session.createQuery("from com.site.modelos.Teste ").list();
//		 List<Teste> lista = session.createQuery("select t from com.site.modelos.Teste as t where t.id = 19").list();
	     
	     
	     
//	     for(Teste teste: lista) {
//	    	 System.out.println("Conteudo: "+teste.getConteudo());
//	    	 t = teste;
//	     }
//	     t.setConteudo("Trocado uhuuu!");
//	     session.beginTransaction();
////	     session.merge(t);
//	     Teste du = (Teste)session.load(Teste.class, 19);
//         session.delete(du);
//	     session.getTransaction().commit();
//		 
//		 session.close();
		 System.out.println("Done");
		 
		 
		 
//		 session.beginTransaction();
//		 Teste r = new Teste();
//		 r.setId(17);
//		 r.setConteudo("Troquei uhuu 1323132porra!");//value="Cadastrar"> //onclick="showName(e)" >  
//		 
//		 session.merge(r);
//		 session.getTransaction().commit();
//		 session.close();
		 BancoDAO bd = new BancoDAO();
		 Conteudo c = new Conteudo();
		 DadosUsuario d = new DadosUsuario();
				 d.setEmail("aadsdsddaa");
		 c.setAssunto("assunto");
		 c.setDetalhes("detlahes");
		 c.setEndereco("234");
		 bd.inserir(d);
		 bd.fechaConexao();
		 
		 
	  }
	
}
