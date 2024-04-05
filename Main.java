package br.cesul;

public class Main {
    public static void main(String[] args) {
        Election election = new Election(50, 40, 20, 10);
        System.out.println("O canditado campeão foi o A com : " + election.candidateA);
        System.out.println("O cantidado B ficou com : " + election.candidateB);
        System.out.println("A quantidade de votos nulos ficou em: " + election.voteNull);
        System.out.println("A quantidade de voltos em brancos ficow em: " + election.voteWhite);
        System.out.println((election.checkResult()));
    }
}
