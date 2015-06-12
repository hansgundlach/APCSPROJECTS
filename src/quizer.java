import java.util.*;
public class quizer {
	 //this class is build only using the AP java subset
public static void main(String args[]){
	Question jello = new Question("hello","eorld2");
	questions.add(jello);
	AskQuestion();
}
	
	//we will test wether the user get question works 
private static Scanner sc = new Scanner(System.in);

	
	public static ArrayList<Question> questions = new ArrayList<Question>();
	
	/**@precondition two string that are the question and answe
	 * @postcondition an Arraylist with the new question and answe
	 * @param question
	 * @param answer
	 */
	public static void questadder(String question,String answer){
		Question math =  new Question(question,answer);
		questions.add(math);
	}
	static int i =0;
	public static void AskQuestion(){
		while(i<6){
		int randindex = (int) Math.random()*questions.size();
		Question currentQuestion = questions.get(randindex);
		System.out.println(currentQuestion.getQuestion());
		
		while(sc.hasNext()){
			//selects a random question
		//get a better understanding of hasNext
		String answer2 = sc.nextLine();
		if(answer2.equals(currentQuestion.getter())){
			System.out.println("correct");
		}else{
			System.out.println("incorrect");
			System.out.println("the correct answer is:"+currentQuestion.getter());
		}
		}
		i++;
	}
	
	}
}
