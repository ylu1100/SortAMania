//Implement this abstract class in your own class in this project.
//Name your class Team#SortCompetition.
//e.g. Team 1 should name their class Team1SortCompetition
public abstract class
SortCompetition {
	
	public abstract int challengeOne(int[] arr);

	public abstract int challengeTwo(String[] arr, String query);

	public abstract int challengeThree(int[] arr);

	public abstract int challengeFour(int[][] arr);

	public abstract int challengeFive(Comparable[] arr, Comparable query);

	//Add a custom greeting so your sorter can introduce itself
	public abstract String greeting();
}

