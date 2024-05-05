package assignment_8;

public class TestSequence {
	public static void main(String[] args) {
		Sentence sentence= new Sentence("Hello my name is Dylan");
		System.out.println("getSequence() (Sentence Class): " + sentence.getSequence());
		System.out.println("getFirst(): " + sentence.getFirst());
		System.out.println("getLast(): " + sentence.getLast());
		System.out.println("");
		System.out.println("getPosition() (Word Class) position of first word in sentence: " + ((Word)sentence.getFirst()).getPosition());
		System.out.println("getPosition() (Word Class) position of last word in sentence: " + ((Word)sentence.getLast()).getPosition());
			/* Word Methods */
		System.out.println("");
		System.out.println("getSequence() (Word Class) on first word in sentence: " + ((Word)sentence.getFirst()).getSequence());
		System.out.println("getSequence() (Word Class) on last word in sentence: " + ((Word)sentence.getLast()).getSequence());
		System.out.println("");
		System.out.println("getFirst() (Word Class) on the first letter in the first word of the sentence: " + ((Word)sentence.getFirst()).getFirst());
		System.out.println("getLast() (Word Class) on the last letter in the last word of the sentence: " + ((Word)sentence.getLast()).getLast());
		System.out.println("");
		System.out.println("getFirst() (Word Class) on the first letter in the first word of the sentence (using .get() on the ArrayList): " + (((Word)sentence.getFirst()).getSequence()).get(0));
		int indexOfLast = ((Word)sentence.getLast()).getSequence().size()-1 ;
		System.out.println("getFirst() (Word Class) on the first letter in the first word of the sentence (using .get() on the ArrayList: " + (((Word)sentence.getLast()).getSequence()).get(indexOfLast));
		//TODO 
		/*
		 * 
		 * 
		 * 
		 * 
		 */
	}
}
