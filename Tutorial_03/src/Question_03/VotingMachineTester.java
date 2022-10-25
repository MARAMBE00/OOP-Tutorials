package Question_03;

public class VotingMachineTester {

    public static void main(String[] args) {

        VotingMachine voting = new VotingMachine();
        voting.voteConservative();
        voting.voteConservative();
        voting.voteLabour();
        //voting.clearState();

        System.out.println("Vote for conservative: " + voting.getConservativeVote());
        System.out.println("Vote for labour: " + voting.getLabourVotes());
    }
}
