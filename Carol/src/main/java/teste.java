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
		 
		 List<Object> lista = bd.findAll("Conteudo");
		 for(Object ob : lista) {
//			 DadosUsuario du = (DadosUsuario)ob;
			 Conteudo c = (Conteudo) ob;
			 System.out.println("Conteudo senha "+c.getId());
		 }
//		 if(lista.size() == 0) {
//			 System.out.println("Sem nada!");
//		 }
		 Conteudo c = new Conteudo();
//		 DadosUsuario d = new DadosUsuario();
//		 		d.setNome("roberto1234");
//				 d.setEmail("carolina@@@");
//				 d.setSexo("Feminino");
		 c.setTipo("assunto");
////		 c.setDetalhes("detlahes");
		 c.setEndereco("234");
		 c.setMensagem("Mensagem");
		 bd.inserir(c);
//		 Conteudo cu;
//		 try {
//			 cu = (Conteudo)bd.findOne(3, "Conteudo");
//		 }catch(Exception e) {
//			 cu = null;
//		 }
//		 
//		 System.out.println(cu);
//		 System.out.println(cu.getDetalhes());
//		 bd.fechaConexao();
		 
		 
	  }
	
}
