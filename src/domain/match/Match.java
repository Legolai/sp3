package domain.match;

import domain.team.*;
import java.util.Date;

public abstract class Match {
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

    public void setTeams(Team a, Team b) {
        teams[0] = a;
        teams[1] = b;
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

    public abstract void setWinner(Team winner);
    public abstract Team getWinner();

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
