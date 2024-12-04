/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quebracabeca;

/**
 *
 * @author aluno
 */
public  abstract class Borda {
    private int id;
    private boolean a;
    private boolean b;
    
    
    public Borda(int id, boolean a, boolean b){
        this.id = id;
        this.a = a;
        this.b = b;
    }
    
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
    
    public boolean getA(){
        return this.a;
    }
    public void setA(boolean a){
        this.a = a;
    }
    
    public boolean getB(){
        return this.b;
    }
    public void setB(boolean b){
        this.b = b;
    }
    
}
