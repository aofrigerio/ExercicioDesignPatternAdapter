package com.br.Adapter;


public class AdapterExercise {
    public static void main(String args[]) {
        App a = new App();
        WebSite w = new WebSite();

        w.exibir();
        a.exibir();
    }
}
