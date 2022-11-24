package Question_03;

public class VotingMachineTester {

    public static void main(String[] args) {

        VotingMachine voting = new VotingMachine();
        for(int i=1; i <= 100; i++){
            double flip = Math.random();
            if(flip <= 0.5)
                voting.voteLabour();
            else
                voting.voteConservative();
        }

        System.out.println("Conservative received: " + voting.getConservativeVote() + " votes");
        System.out.println("Labour received: " + voting.getLabourVotes() + " votes");
    }
}
