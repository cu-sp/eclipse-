package assignment_8;

public class Character extends OrderedThing{
    private char character;
    public Character(char character) {
        this.character = character;
    }

    public char getCharacter() {
        return this.character;
    }
    public String toString () {
    	return String.valueOf(getCharacter());
    }
}
