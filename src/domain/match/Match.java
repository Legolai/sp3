package domain.match;

import domain.team.*;
import java.util.Date;

public class Match {
    private MatchResult result;
    private Team[] teams;
    private Date date;
    private Team winner;

    public Match() {
        teams = new Team[2];
        date = new Date();
        result = new MatchResult();
    }
    public Match(Team[] teams) {
        this.teams = teams;
        date = new Date();
        result = new MatchResult();
    }
    public Match(Team[] teams, Date date) {
        this.teams = teams;
        this.date = date;
        result = new MatchResult();
    }

    public Team getTeam(int i){     //i needs to be 0 or 1
        return teams[i];
    }
    public void setTeams(Team a, Team b) {
        teams[0] = a;
        teams[1] = b;
    }
    public void exchangeTeamX(Team a, int x) {      //x has to be 0 or 1
        teams[x] = a;
    }
    public String homeAndGuestTeam() {
        return "Team 0 is: "+teams[0].getName()+" and team 1 is: "+teams[1].getName();
    }

    public void setDate(Date date) {
        this.date = date;
    }
    public Date getDate() {
        return date;
    }

    public void setResult(int homeScore, int guestScore) {
        result.setResult(homeScore, guestScore);
    }
    public int[] getScore() {
        return result.getScore();
    }
    public int[] getCalculatedScore() {
        return result.calculateScore();
    }

    public void setWinner(Team winner) {
        this.winner = winner;
    }
    public Team getWinner() {
        return winner;
    }

    @Override
    public String toString() {
        String msg;
        if (winner == null) {
            msg = "This match is between ["+teams[0].getName()+"] and ["+teams[1].getName()+"]" +
                    " taking place the "+date.toString();
        } else {
            msg =   "This match is between ["+teams[0].getName()+"] and ["+teams[1].getName()+"]" +
                    " that took place the "+date.toString()+" and the result is: "+winner.getName() +
                    " won the match";
        }
        return msg;
    }
}
