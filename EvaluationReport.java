/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adelaidecruiseline;

/**
 * Create the evaluation report class
 * @author Yifei
 * @version 1.0.0
 * @since 02/10/2014
 */
public class EvaluationReport {
    /**
     * 
     */
    private int[] ratings = new int[6];
    /**
     * 
     */
    private String[] surveys = new String[6];
    
    public int[] getRatings() {
        return ratings;
    }
    public void setRatings(int[] ratings) {
        this.ratings = ratings;
    }
    
    public String[] getQuestions() {
        return surveys;
    }

    public void setQuestions(String[] questions) {
        this.surveys = questions;
    }
}
