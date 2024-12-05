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
            //verifica se é a posição superior esquerda da matriz
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
            }
            //verifica se é a posição superior direita da matriz
            else if(linha == 0 && coluna == grid[0].length - 1){
                if (peca.getBorda(0) == 3 && peca.getBorda(1) == 3 ) {
                    //verifica se a borda da peça inserida é encaixavel com a de traz e a de baixo dela
                    if(peca.getBorda(3) != grid[linha][coluna-1].getBorda(1) && peca.getBorda(2) != grid[linha+1][coluna].getBorda(0) ){
                        //inserção
                        grid[linha][coluna] = peca;
                        System.out.println("A peça foi encaixada");
                    }else{
                        System.out.println("A peça nao se encaixa com a da esquerda ou com a de baixo.");
                    }
                }else{
                    System.out.println("A peça nao se encaixa com o tabuleiro");
                }
            }
            //verifica se é a posição inferior esquerda da matriz
            else if(linha == grid.length - 1 && coluna == 0){
                if (peca.getBorda(2) == 3 && peca.getBorda(3) == 3 ) {
                    //verifica se a borda da peça inserida é encaixavel com a de cima e a da frente dela
                    if(peca.getBorda(0) != grid[linha-1][coluna].getBorda(2) && peca.getBorda(1) != grid[linha][coluna+1].getBorda(3) ){
                        //inserção
                        grid[linha][coluna] = peca;
                        System.out.println("A peça foi encaixada");
                    }else{
                        System.out.println("A peça nao se encaixa com a da frente ou com a de baixo.");
                    }
                }else{
                    System.out.println("A peça nao se encaixa com o tabuleiro");
                }
            }
            //verifica se é a posição inferior direita da matriz
            else if(linha == grid.length - 1 && coluna == grid[0].length - 1){
                if (peca.getBorda(1) == 3 && peca.getBorda(2) == 3 ) {
                    //verifica se a borda da peça inserida é encaixavel com a de cima e a da traz dela
                    if(peca.getBorda(0) != grid[linha-1][coluna].getBorda(2) && peca.getBorda(3) != grid[linha][coluna+1].getBorda(0) ){
                        //inserção
                        grid[linha][coluna] = peca;
                        System.out.println("A peça foi encaixada");
                    }else{
                        System.out.println("A peça nao se encaixa com a da frente ou com a de baixo.");
                    }
                }else{
                    System.out.println("A peça nao se encaixa com o tabuleiro");
                }
            }

            return true;
        }
        return false;
    }

}
