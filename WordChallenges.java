package Challenges1.Challenges;

/** The WordChallenges program contains a collection of methods which alter a string literal.
 * @author Spaggers
 * @version 1.0
 * @since 2/28/23
 */
public class WordChallenges{
    private String word;

    public static void main(String[] args){
        System.out.print("Hello");
    }

    /**
     *  WordChallenges()
     */
    public WordChallenges(){
        this.setWord(" ");
    }

    /**
     * @param word: This is the user-defined word or string-literal
     */
    public void setWord(String word){
        this.word = word;
    }

    /**
     * @return  : returns the user-defined word or string-literal
     */
    public String getWord(){
        return this.word;
    }

    public String reverseWord(String word){
        String[] spliced = word.split(" ");
        System.out.print(spliced);
        return word;
    }

}
