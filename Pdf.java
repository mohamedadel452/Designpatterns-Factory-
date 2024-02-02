/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exampleonfactory;

/**
 *
 * @author hp
 */
public class Pdf implements File{

    @Override
    public void open() {
        System.out.println("open file pdf");
    }

    @Override
    public void delet() {
        System.out.println("delet file pdf");
       
    }
    
}
