package assignment_8;
import java.util.ArrayList;

public class Sentence extends OrderedThing implements SequentiallyOrdered{
    private ArrayList<Word> words;
    public Sentence(String sentence) {
        this.words = new ArrayList<>();
        String[] wordArray = sentence.split("[^\\w’]+");
        for (int i = 0; i < wordArray.length; i++) {
            this.words.add(new Word(wordArray[i], i)); // Adds a new word to the sentance ArrayList
        }
    }

    public OrderedThing getFirst() {
        return this.words.get(0);
    }

    public OrderedThing getLast() {
        return this.words.get(this.words.size() - 1);
    }

    public ArrayList<OrderedThing> getSequence() {
        ArrayList<OrderedThing> sequence = new ArrayList<>();
        sequence.addAll(this.words);
        return sequence;
    }
}