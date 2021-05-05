package com.company;

import java.util.List;

public interface ExportadorListaProduto {
    public String abrirTabela();

    public String fecharTabela();

    public String abrirLinha();

    public String fecharLinha();

    public String abrirLinhaTitulos();

    public String fecharLinhaTitulos();

    public String abrirColuna(String valor);

    public String fecharColuna();

    public String exportar(List<Produto> listaProdutos);

    static ExportadorListaProduto newInstance() {
        return newInstance("html");
    }

    static ExportadorListaProduto newInstance(String extensaoArquivoExportacao) {
        switch (extensaoArquivoExportacao) {
            case "html":
                return new ExportadorListaProdutoHtml();
            case "csv":
                return new ExportadorListaProdutoCsv();
            case "md":
                return new ExportadorListaProdutoMarkdown();
            default:
                System.out.println("Formato de arquivo não suportado");
        }

        return null;
    }
}
