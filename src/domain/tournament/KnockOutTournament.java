package domain.tournament;

import domain.team.Team;
import domain.match.MatchProgram;
import java.util.ArrayList;

public class KnockOutTournament extends Tournament{

    public KnockOutTournament(String name, Sport tournamentType) {
        super(name, tournamentType);
    }
    public KnockOutTournament(String name, Sport tournamentType, ArrayList<Team> contenders) {
        super(name, tournamentType, contenders);
    }

    @Override
    public void createMatchProgram(String matchType) {
        program.setMatchType("score");      // for now it is score
        program.createMatchProgram();
    }

    @Override
    public MatchProgram getMatchProgram() {
        return program;
    }

    @Override
    public ArrayList<Team> getContenders() {
        return contenders;
    }

    @Override
    public String viewTeamRankings() {
        return null;
    }

    @Override
    public void viewGroupRankings(){}   //not relevant so empty

}
