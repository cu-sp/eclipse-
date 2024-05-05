package assignment_8;
import java.util.ArrayList;

public class Word extends OrderedThing implements SequentiallyOrdered {
    private ArrayList<Character> characters;
    private int position;
    public Word(String word, int position) {
        this.characters = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            this.characters.add(new Character(word.charAt(i))); // Add a new charicter to the ArrayList charicters
        }
        this.position = position;
    }

    public OrderedThing getFirst() {
        return this.characters.get(0);
    }

    public OrderedThing getLast() {
        return this.characters.get(this.characters.size() - 1);
    }

    public ArrayList<OrderedThing> getSequence() {
        ArrayList<OrderedThing> sequence = new ArrayList<>();
        sequence.addAll(this.characters);
        return sequence;
    }

    public int getPosition() {
        return this.position;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Character character : characters) {
            sb.append(character); // Append each character to the StringBuilder
        }
        return sb.toString(); // Return the concatenated characters as a string
    }
}
