/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exampleonfactory;

/**
 *
 * @author hp
 */
public class Word implements File{

    @Override
    public void open() {
        System.out.println("open file word");
    }

    @Override
    public void delet() {
        System.out.println("delet file word");
       
    }
    
    
    
}
