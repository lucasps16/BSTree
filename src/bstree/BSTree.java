/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bstree;

import java.util.*;


/**
 *
 * @author Estudiante
 * @param <T>
 */
public class BSTree<T extends Comparable<T>> implements Iterable<T>{

    private BSNode<T> root;
    private Comparator<T> comparator;
    
    public BSTree(){
      root = null;
      comparator = null;
   }
    
    public BSTree(Comparator<T> comp){
        root = null;
        comparator = comp;
    }
    
    private int compare(T x, T y){
        if(comparator == null){
            return x.compareTo(y);
        } else{
            return comparator.compare(x,y);
        }
      
    }
    
    private BSNode<T> insert(BSNode<T> n, T toInsert){
        if(n == null){
            return new BSNode<T>(toInsert); 
        }
        
        if(compare(toInsert,n.element)==0){
            return n;
        }
        
        if(compare(toInsert,n.element)<0){
            n.left = insert(n.left, toInsert);
        } else{
            n.right = insert(n.right, toInsert);
        }
        return n;
    }
    
    public boolean search(T toSearch){
        return search(root, toSearch);
    }
    
    private boolean search(BSNode<T> n, T toSearch ){
        if (n == null){
            return false;
        }else if(compare(toSearch, n.element) == 0){
            return true;
        }else if (compare(toSearch, n.element)<0){
            return search(n.left, toSearch);
        } else {
            return search(n.right, toSearch);
        }
    }

    @Override
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    

    

}
