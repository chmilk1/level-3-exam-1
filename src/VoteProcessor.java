import java.util.ArrayList;

public class VoteProcessor {

	public Object calculateElectionWinner(ArrayList<String> votes) {
		int pope = 0;
		int ed = 0;
		for (String string : votes) {
			if (string.contains("ope")) {
				pope = pope+1;
			} else if(string.contains("dward")||string.contains("DWARD")){
				ed=ed+1;
			}
				
		}
		if (ed<pope) {
			return "pope francis";
			
		} else if (pope<ed){
			return "edward Snowden";
		} else if (ed==pope){
			return "TIE";
		}
		return null;
	}

}
