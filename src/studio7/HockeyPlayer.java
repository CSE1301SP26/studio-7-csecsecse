package src.studio7;

public class HockeyPlayer {

private String name;
private int number;
private int goals;
private int assists;
private int games;
private String domHand;
private int points;

public HockeyPlayer(String name, int number, String domHand){
    this.name = name;
    this.number = number; 
    this.domHand = domHand;
    this.goals = 0;
    this.assists = 0;
    this.games = 0;
    this.points = 0;
}

public void RecordGame(int goals, int assists){
    this.games ++;
    this.goals += goals;
    this.assists += assists;
    this.points = this.goals + this.assists;
}

public int getPoints(){
    return this.points;
}

public int getAssists(){
    return this.assists;
}

public int getGoals(){
    return this.goals;
}

public int getGames(){
    return this.games;
}

public String getName(){
    return this.name;
}

public int getNumber(){
    return this.number;
}

public String getDomHand(){
    return this.domHand;
}


public static void main(String[] args){

}

}
