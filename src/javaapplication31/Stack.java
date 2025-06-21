/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication31;

/**
 *
 * @author ASUS
 */
public class Stack {
    Boolean kondisi;
    private int ukuran;
    private int[] stack;
    private int TOP, BOTTOM;

    public Stack(int s){
        ukuran = s;
        stack = new int[ukuran];
        TOP = -1;
        BOTTOM = -1;
    }

    public void push(int j){
        if(isEmpty()) {
            BOTTOM++;
            TOP++;
            stack[BOTTOM] = j;
        }else if(!isFull()){
            TOP++;
            stack[TOP] = j;
        }
        else if(isFull()){
            System.out.println("Stack Penuh");
        }

        if(BOTTOM == -1){
            BOTTOM = 0;
        }
    }

    public int pop(){
        int terhapus = stack[TOP];
        if (!isEmpty()) {
            stack[TOP] = '\0';
            if(TOP == 0){
                BOTTOM--;
            }
            TOP--;
        } else {
            System.out.println("Stack masih kosong");
        }

        return terhapus;
    }

    public int peek(){
        return stack[TOP];
    }

    public boolean isEmpty(){
        return (TOP == -1);
    }

    public boolean isFull(){
        return(TOP == ukuran -1);
    }

    public void fill(int... values) {
        if (!isFull()) {
            for (int i = 0; i < values.length; i++) {
                push(values[i]);
            }
        } else {
            System.out.println("Stack penuh");
        }
    }
    

    public void tampil(){
        for (int i = TOP; i>= 0; i--){
            System.out.printf(stack[i]+ " ");
        }
        System.out.println();
    }

    // public boolean cekStack() {
    //     boolean Kondisi = true;
    //     if(stack[0] == 4 && stack[1] == 3 && stack[2]==2 && stack[3]==1){
    //         Kondisi= false;
    //     }
    //     return Kondisi;
    // }

    @Override
    public String toString(){
        String s = " ";
        for(int i = 0; i <= TOP; i++){
            s += stack[i]+ " ";
        }
        return s;
    }
}
