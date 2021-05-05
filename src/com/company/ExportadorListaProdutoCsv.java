package com.company;

import java.util.List;

class ExportadorListaProdutoCsv extends AbstractExportadorListaProduto{
    @Override
    public String abrirTabela() {
        return "";
    }

    @Override
    public String fecharTabela() {
        return "";
    }

    @Override
    public String abrirLinha() {
        return "\n";
    }

    @Override
    public String fecharLinha() {
        return "";
    }

    @Override
    public String abrirLinhaTitulos() {
        return null;
    }

    @Override
    public String fecharLinhaTitulos() {
        return "";
    }

    @Override
    public String abrirColuna(String valor) {
        return valor + ",";
    }

    @Override
    public String fecharColuna() {
        return "";
    }
}
