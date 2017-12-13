package com.site.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.hibernate.Session;

import com.site.infra.CriadorDeSession;
import com.site.infra.HibernateUtil;
import com.site.modelos.Conteudo;
import com.site.modelos.DadosUsuario;

public  class BancoDAO {
	private static Session session;
	public BancoDAO() {
//		h =  new HibernateUtil();
		session = HibernateUtil.getSessionFactory().openSession();
//		this.session = CriadorDeSession.getSession();
	}
	
	public void fechaConexao() {
		session.close();
	}
	
	public static void inserir(Object object) {
		if(object instanceof DadosUsuario) {
			System.out.println("Inserindo no banco um DadosUsuario");
			DadosUsuario du = (DadosUsuario)object;
			session.beginTransaction();
			session.save(du);
			session.getTransaction().commit();
		}else {
			Conteudo ct = (Conteudo)object;
			session.beginTransaction();
			session.save(ct);
			session.getTransaction().commit();
		}
		
	}
	
	
	public static List<Object> findAll(Object object) {
		if(object instanceof DadosUsuario) {
			return  ((List<Object>)session.createQuery("from com.site.modelos.DadosUsuario").list());
		}else {
			return  ((List<Object>)session.createQuery("from com.site.modelos.Conteudo").list());
		}
	}
	public static Object findOne(int id,String tipo) {
		if(tipo.equals("DadosUsuario")) {
			DadosUsuario du = (DadosUsuario)session.load(DadosUsuario.class, id);
			return (Object) du;
		}else {
			Conteudo ct = (Conteudo)session.load(Conteudo.class, id);
			return (Object) ct;
		}
		
	}
	
	public static boolean remove(int id, String tipo) {
		boolean removeu = false;
		if(tipo.equals("DadosUsuario")) {
			DadosUsuario du = (DadosUsuario)session.load(DadosUsuario.class, id);
	         session.delete(du);
			removeu = true;
		}else {
			Conteudo ct = (Conteudo)session.load(Conteudo.class, id);
	         session.delete(ct);
			removeu = true;
		}
		session.getTransaction().commit();
		return removeu;
	}
	
	public static boolean update (Object object) {
		boolean update = false;
		session.beginTransaction();
		if(object instanceof Conteudo) {
			Conteudo ct = (Conteudo)object;
			
			session.merge(ct);
			update = true;
		}
		session.getTransaction().commit();
		return update;
	}
//	 session.beginTransaction();
//	 session.save(t);
//	 session.getTransaction().commit();
	 
//	 List<Teste> lista = session.createQuery("from com.site.modelos.Teste ").list();
//	 List<Teste> lista = session.createQuery("select t from com.site.modelos.DadosUsuario as t where t.id = 19").list();
    
    
    
//    for(Teste teste: lista) {
//   	 System.out.println("Conteudo: "+teste.getConteudo());
//   	 t = teste;
//    }

}