package com.company;

import java.util.Arrays;
import java.util.List;

public abstract class AbstractExportadorListaProduto implements ExportadorListaProduto {
    protected static final List<String> carregarTitulos_colunas() {
        return Arrays.asList("Id", "Descricao", "Marca", "Modelo", "Estoque");
    }

    public String exportar(List<Produto> listaProdutos) {
        StringBuilder sb = new StringBuilder();
        sb.append(abrirTabela());
        sb.append(gerarColunasDaLinha(carregarTitulos_colunas()));
        sb.append(fecharLinhaTitulos());

        gerarLinhaDeProdutos(sb, listaProdutos);

        sb.append(fecharTabela());
        return sb.toString();
    }

    private void gerarLinhaDeProdutos(StringBuilder sb, List<Produto> produtos) {
        for (int i = 0; i < produtos.size(); i++) {
            List<String> valoresDosCampos = Arrays.asList(String.valueOf(produtos.get(i).getIdProduto()),
                    produtos.get(i).getDescricao(), produtos.get(i).getMarca(), produtos.get(i).getModelo(),
                    String.valueOf(produtos.get(i).getEstoque()));
            sb.append(gerarColunasDaLinha(valoresDosCampos));
        }
    }

    protected String gerarColunasDaLinha(List<String> valores) {
        StringBuilder sb = new StringBuilder();
        sb.append(abrirLinha());
        for (int i = 0; i < valores.size(); i++) {
            sb.append(abrirColuna(valores.get(i)))
                    .append(fecharColuna());
        }
        sb.append(fecharLinha());
        return sb.toString();
    }
}
