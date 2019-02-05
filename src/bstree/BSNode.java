/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bstree;

/**
 *
 * @author Estudiante
 */
class BSNode<T>{
    T element;
    BSNode<T> left;
    BSNode<T> right;

    public BSNode(T element) {
        this.element = element;
    }    

    public BSNode(T element, BSNode<T> left, BSNode<T> right) {
        this.element = element;
        this.left = left;
        this.right = right;
    }
    
    public String toString(){
        return element.toString();
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public BSNode<T> getLeft() {
        return left;
    }

    public void setLeft(BSNode<T> left) {
        this.left = left;
    }

    public BSNode<T> getRight() {
        return right;
    }

    public void setRight(BSNode<T> right) {
        this.right = right;
    }
}
