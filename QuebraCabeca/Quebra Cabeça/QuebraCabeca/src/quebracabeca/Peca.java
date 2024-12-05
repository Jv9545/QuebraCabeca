/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quebracabeca;

/**
 *
 * @author aluno
 */
public class Peca {
    private int id;
    // 0 = superior 1 = direita 2 = inferior 3 = esquerda 
    private Borda bordas[]; 
    public Peca(int id, Borda zero, Borda um, Borda dois, Borda tres){
        this.id = id;
        bordas = new Borda[4];
        this.bordas[0] = zero;
        this.bordas[1] = um;
        this.bordas[2] = dois;
        this.bordas[3] = tres;
    }
    
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
    
    public int getBorda(int i){
        return this.bordas[i].getId();
    }
    public void setId(int i, Borda borda){
        this.bordas[i] = borda;
    }
}
