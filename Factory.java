/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exampleonfactory;

/**
 *
 * @author hp
 */
public class Factory {
    
    
    
    public File getfile(String type){
        if(type.equals("word")){
            return new Word();
        }
        else if(type.equals("pdf")){
            return new Pdf();
        }
        throw new IllegalArgumentException();
    }
    
}
