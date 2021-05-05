package com.company;

class ExportadorListaProdutoHtml extends AbstractExportadorListaProduto{
    @Override
    public String abrirTabela() {
        return "<table>\n";
    }

    @Override
    public String fecharTabela() {
        return "</table>\n";
    }

    @Override
    public String abrirLinha() {
        return "<tr>\n";
    }

    @Override
    public String fecharLinha() {
        return "</tr>\n";
    }

    @Override
    public String abrirLinhaTitulos() {
        return "<th>\n";
    }

    @Override
    public String fecharLinhaTitulos() {
        return "</th>\n";
    }

    @Override
    public String abrirColuna(String valor) {
        return "<td>" + valor;
    }

    @Override
    public String fecharColuna() {
        return "</td>\n";
    }
}
