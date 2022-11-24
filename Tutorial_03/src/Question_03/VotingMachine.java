package Question_03;

public class VotingMachine {

    private int labourVotes;
    private int conservativeVote;

    public void clearState(){
        labourVotes = 0;
        conservativeVote = 0;
    }

    public void voteLabour(){
        ++labourVotes;
        labourVotes += (int) 3*Math.random();
    }

    public void voteConservative(){
        ++conservativeVote;
    }

    public int getLabourVotes() {
        return labourVotes;
    }

    public int getConservativeVote() {
        return conservativeVote;
    }
}
