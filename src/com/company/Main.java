package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Smartphone", "Apple", "iPhone 12", "1200"));
        produtos.add(new Produto("Tablet", "Apple", "iPad Pro", "1000"));
        produtos.add(new Produto("Notebook", "Dell", "XPS", "800"));

        ExportadorListaProduto exportadorListaProdutoCsv = ExportadorListaProduto.newInstance("csv");
        System.out.println("Lista de produtos em CSV:");
        System.out.println(exportadorListaProdutoCsv.exportar(produtos));
    }
}
