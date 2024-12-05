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

    // Adiciona uma peça ao tabuleiro após verificar se a peça se encaixa na posição informada no main
    public boolean adicionarPeca(Peca peca, int linha, int coluna) {
        //verifica se a posição é vazia
        if (grid[linha][coluna] == null) {
            //verifica se é a primeira posição da matriz
            if (linha == 0 && coluna == 0) {
                //verifica se a borda superior e esquerda são preenchidas
                if (peca.getBorda(0) == 3 && peca.getBorda(3) == 3 ) {
                    //verifica se a borda da peça inserida é encaixavel com a da frete e a de baixo dela
                    if(peca.getBorda(1) != grid[linha][coluna+1].getBorda(3) && peca.getBorda(2) != grid[linha+1][coluna].getBorda(0) ){
                        //inserção
                        grid[linha][coluna] = peca;
                        System.out.println("A peça foi encaixada");
                    }else{
                        System.out.println("A peça nao se encaixa com a da frente ou com a de baixo.");
                    }
                }else{
                    System.out.println("A peça nao se encaixa com o tabuleiro");
                }
            }else if(linha == 0 && coluna == grid[0].length - 1){
                
            }else if(linha == grid.length - 1 && coluna == 0){
                
            }else if(linha == grid.length - 1 && coluna == grid[0].length - 1){
                
            }

            return true;
        }
        return false;
    }

}
