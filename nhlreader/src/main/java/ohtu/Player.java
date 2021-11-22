package ohtu;

public class Player implements Comparable<Player> {

    private String name;
    private String nationality;
    private String team;
    private int assists;
    private int goals;
    
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getNationality() {
        return nationality;
    }

    public String getTeam() {
        return team;
    }

    public int getAssists() {
        return assists;
    }

    public int getGoals() {
        return goals;
    }

    public void setAssits(int assists) {
        this.assists = assists;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
//        return this.name + " " + this.team + " " + this.goals
//                + " + " + this.assists + " =  " + total;
        int total = this.goals + this.assists;
        return this.name + " " + this.team + " " + this.goals + " + " + this.assists + " = " +
                total;
    }

    @Override
    public int compareTo(Player p) {
        
        int compareTotal = ((Player) p).getGoals()+((Player) p).getAssists();

        return compareTotal - (this.goals+this.assists);
    }

}
