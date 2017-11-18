package com.br.Adapter;

public class App {
	public void exibir() {
        //WebService ws = new WebService();

        Adapter ws = new Adapter();
        
        //Essa linha dá um erro porque ws.imprimir() retorna uma string.
        //Use um adapter (não vale cast) para corrigir o problema.
        //Dica: A classe app deve instanciar o adapter, não o objeto webservice diretamente.
        int total = 282847 + ws.imprimir();

        System.out.println(total);
    }
}
