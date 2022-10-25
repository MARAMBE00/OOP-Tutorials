package Question_03;

public class VotingMachine {

    private int labourVotes;
    private int conservativeVote;

    public void clearState(){
        labourVotes = 0;
        conservativeVote = 0;
    }

    public void voteLabour(){
        labourVotes = 1 + labourVotes;
        labourVotes += (int) Math.random();
    }

    public void voteConservative(){
        conservativeVote = 1 + conservativeVote;
    }

    public int getLabourVotes() {
        return labourVotes;
    }

    public int getConservativeVote() {
        return conservativeVote;
    }
}
