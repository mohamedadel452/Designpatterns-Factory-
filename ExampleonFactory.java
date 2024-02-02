/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exampleonfactory;

/**
 *
 * @author hp
 */
public class ExampleonFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Factory factory=new Factory();
        
        File file1=factory.getfile("pdf");
        file1.open();
        file1.delet();
        File file=factory.getfile("word");
        file.open();
        file.delet();
        
        
    }
    
}
