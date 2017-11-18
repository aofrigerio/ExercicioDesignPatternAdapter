package com.br.Adapter;

public class Adapter implements IAdapter {
	
	//preencher o conteúdo da classe Adapter para fazer com que o método ws.imprimir retorne
    //um valor numérico e não mais inteiro (não vale cast)
	
	public WebService webservice;

	public Adapter() {
		// TODO Auto-generated constructor stub
		webservice = new WebService();
	}
	
	@Override
	public int imprimir() {
		// TODO Auto-generated method stub
		return Integer.parseInt(webservice.imprimir());
	}
	
	
	
}
