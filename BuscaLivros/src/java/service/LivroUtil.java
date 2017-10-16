/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.HashMap;
import model.Livro;

/**
 *
 * @author ra21067003
 */
public class LivroUtil {
    
    public static HashMap<Integer, Livro> getLivros() {
        HashMap<Integer, Livro> livros = new HashMap<>();
        
        Livro livro1 = new Livro(1, "A Cabana", "Um cara aí");
        Livro livro2 = new Livro(2, "O Segredo", "Outro cara aí");
        Livro livro3 = new Livro(3, "Seja líder de si mesmo", "Augusto Cury");
        Livro livro4 = new Livro(4, "Clean Code", "Uncle Bob");
        
        livros.put(livro1.getId(), livro1);
        livros.put(livro2.getId(), livro2);
        livros.put(livro3.getId(), livro3);
        livros.put(livro4.getId(), livro4);
        
        return livros;
    }
    
    public static Livro getLivro( int id ) {
        return getLivros().get(id);
    }
    
}
