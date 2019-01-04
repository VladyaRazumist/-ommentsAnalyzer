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
public abstract class KeywordAnalyzer implements TextAnalyzer{
     
    protected abstract String[] getKeywords ();
    protected abstract Label getLabel();
    @Override
    public Label processText(String text){
        for (String keyword : this.getKeywords()) {
            if (text.contains(keyword)) {
                return this.getLabel();
            }
        }
        return Label.OK;
}
}
