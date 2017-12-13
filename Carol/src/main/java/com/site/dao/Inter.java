package com.site.dao;

public class Inter {
	private static BancoDAO dao;
	
	public Inter() {
		dao = new BancoDAO();
	}
	
	public void insere(Object object) {
			dao.inserir(object);
	}
}
