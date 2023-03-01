package Challenges1.Challenges;

/**
 *
 */
public class WordChallenges{
    private String word;

    public static void main(String[] args){
        System.out.print("Hello");
    }

    public WordChallenges(){
        this.setWord(" ");
    }

    public void setWord(String word){
        this.word = word;
    }

    public String getWord(){
        return this.word;
    }

    public String reverseWord(String word){
        String[] spliced = word.split(" ");
        System.out.print(spliced);
        return word;
    }

}
