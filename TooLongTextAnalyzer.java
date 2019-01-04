/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommentAnalyzer;

/**
 *
 * @author леха
 */
public class TooLongTextAnalyzer implements  TextAnalyzer {
    private int maxLength;
    private Label L=Label.TOO_LONG;
    public TooLongTextAnalyzer(int MAX_LENGTH){
        maxLength=MAX_LENGTH;
    }
    
    public Label processText(String text){
       if (text.length()>maxLength)
           return this.L;
       return Label.OK;
    }
    
    
}
