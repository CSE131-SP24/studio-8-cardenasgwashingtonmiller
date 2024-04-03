package studio8;

public class MultipleChoiceQuestion extends Question {
	
	private String[] choices; 
	public MultipleChoiceQuestion(String prompt, String answer, int points, String[] choices) {
		//FIXME
		super(prompt, answer, points);
		this.choices = choices;
		//Call the super class constructor, then create and set
		//instance variables for any values that aren't handled
		//by the base class
	}
	public String[] getChoices() {
		return this.choices;
	}
	@Override
	public void displayPrompt() {
		//FIXME
		super.displayPrompt();
		for (int i = 0; i<choices.length; i++) {
			System.out.println((i + 1) + ". " + choices[i]);
		}
		
		/*
		 * Use the method from the base class to display the prompt,
		 * Then write more code to display all of the choices like so:
		 * 
		 * 1. Choice1
		 * 2. Choice2
		 * 3. Choice3
		 * ...
		 * N. ChoiceN
		 */
		//
		
	}
	
	public static void main(String[] args) {
		String[] choices = {"seven", "nine", "eight", "six"};
		String[] gull = {"10", "39", "19", "1", "28"};
		Question multipleChoice = new MultipleChoiceQuestion("What studio is this?", "3", 1, choices);
		Question m = new MultipleChoiceQuestion("How many gullibles are written on the ceiling?", "4", 2, gull);
				
		multipleChoice.displayPrompt();
		m.displayPrompt();
		System.out.println(m.checkAnswer("2"));//wrong
		System.out.println(m.checkAnswer("3"));
		System.out.println(m.checkAnswer("4"));
		//System.out.println(multipleChoice.checkAnswer("1"));//wrong
		//System.out.println(multipleChoice.checkAnswer("3"));//right
	}

}
