package domain.team;

import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> teamMembers;
    private TeamHistory history;

    public Team(String name) {
        this.name = name;
        teamMembers = new ArrayList<>();
        history = new TeamHistory();
    }
    public Team(String name, ArrayList<Player> teamMembers) {
        this.name = name;
        this.teamMembers = teamMembers;
        history = new TeamHistory();
    }
    public Team(String name, ArrayList<Player> teamMembers, TeamHistory history) {
        this.name = name;
        this.teamMembers = teamMembers;
        this.history = history;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Player> getTeamMembers() {
        return teamMembers;
    }
    public void setTeamMembers(ArrayList<Player> teamMembers) {
        this.teamMembers = teamMembers;
    }
    public void addMember(Player a) {
        teamMembers.add(a);
    }

    public TeamHistory getHistory() {
        return history;
    }
    public void setHistory(TeamHistory history) {
        this.history = history;
    }

    public String teamToString() {
        String playerString = "";
        for(Player p : teamMembers) {
            playerString += "'"+p.getName()+"' ";
        }
        return "The team name is: ["+name+"] and it has the players: "+playerString;
    }
}
