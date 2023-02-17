package day3;

public class HiddenWord{

    /** Declare any fields (instance variables) **/
	String hiddenWord;
	String guess;

    /** Declare a constructor */
	HiddenWord(String hiddenWord){
		this.hiddenWord = hiddenWord;
		
	}

    /** Write the getHint method */
	public String getHint(String guess) {
        if (guess.length() != hiddenWord.length()) {
            return "Invalid guess length";
        }
        String hint = "";
        for (int i = 0; i < hiddenWord.length(); i++) {
            if (hiddenWord.charAt(i) == guess.charAt(i)) {
                hint += hiddenWord.charAt(i);
            } else if (hiddenWord.contains(guess.substring(i, i + 1))) {
                hint += "+";
            } else {
                hint += "*";
            }
        }
        return hint;
    }


    /** This is a main method for testing the class */
    public static void main(String[] args) {
        HiddenWord puzzle = new HiddenWord("HARPS");
        System.out.println(puzzle.getHint("AAAAA") + " it should print +A+++");
        System.out.println(puzzle.getHint("HELLO") + " it should print H****");
        System.out.println(puzzle.getHint("HEART") + " it should print H*++*");
        System.out.println(puzzle.getHint("HARMS") + " it should print HAR*S");
        System.out.println(puzzle.getHint("HARPS") + " it should print HARPS");

    } // end of main


} // end of class

