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
public class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
    private String[] keywords;
      Label L=Label.NEGATIVE_TEXT;
    NegativeTextAnalyzer(){     
        keywords=new String[]{ ":(", "=(", ":|"};
       
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
