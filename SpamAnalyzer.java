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
public class SpamAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
    private String [] keywords;
    private Label L=Label.SPAM;
    SpamAnalyzer(String[] keywords) {
        this.keywords=keywords.clone();
    }
    @Override
    public String[] getKeywords (){
        return keywords;
    }
    @Override
     public Label getLabel() {
        
        return this.L;
    }
   
            
}
