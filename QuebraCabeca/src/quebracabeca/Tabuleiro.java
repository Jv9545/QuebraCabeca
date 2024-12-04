/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quebracabeca;

/**
 *
 * @author aluno
 */
public class Tabuleiro {
        private Peca[][] grid;

    public Tabuleiro(int linhas, int colunas) {
        grid = new Peca[linhas][colunas];
    }

    // Adiciona uma peça ao tabuleiro
    public boolean adicionarPeca(Peca peca, int linha, int coluna) {
        if (grid[linha][coluna] == null) {
            grid[linha][coluna] = peca;
            return true;
        }
        return false;
    }

    // Exibe o tabuleiro
    public void exibir() {
        for (Peca[] linha : grid) {
            for (Peca peca : linha) {
                System.out.print(peca != null ? peca.getId() + " " : ". ");
            }
            System.out.println();
        }
    }
}
