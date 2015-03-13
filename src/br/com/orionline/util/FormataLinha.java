/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.orionline.util;

/**
 *
 * @author ronald
 */
public class FormataLinha {

    public static String formata(String linha, String letra, int tamanho, int direcao) {
        //Checa se a linha a preencher é nula ou branco

        if (linha == null || linha.trim() == "") {
            linha = "";
        }

        //Enquanto linha a preencher possuir 2 espaços em branco, substitui por 1 espaço.
        while (linha.contains(" ")) {
            linha = linha.replaceAll(" ", " ").trim();
        }

        // Retira caracteres estranhos
        linha = linha.replaceAll("[./-", "");
        StringBuffer sb = new StringBuffer(linha);

        if (direcao == 1) { // A esquerda
            for (int i = sb.length(); i < tamanho; i++) {
                sb.insert(0, letra);
            }
        } else if ( direcao == 2){ // A Direita
            for ( int i = sb.length() ; i < tamanho ; i++){
                sb.append(letra);
            }
        }
        return sb.toString();
    }
}
