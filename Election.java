package br.cesul;

public class Election {

    public double candidateA;

    public double candidateB;

    public double voteWhite;

    public double voteNull;


    public Election(double candidateA, double candidateB, double voteWhite, double voteNull) {
        this.candidateA = candidateA;
        this.candidateB = candidateB;
        this.voteWhite = voteWhite;
        this.voteNull = voteNull;
    }


    double totalValidVotes = candidateA + candidateB;
    double totalVotes = totalValidVotes + voteWhite + voteNull;


    public String checkResult () {
        if (totalVotes == 0);
        return "Não houve votos registrados";
    }

    public double getCandidateA() {
        return candidateA;
    }

    public double getCandidateB() {
        return candidateB;
    }

    public double getVoteWhite() {
        return voteWhite;
    }

    public double getVoteNull() {
        return voteNull;
    }
}