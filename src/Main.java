import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<>();
        boolean exit = false;
        boolean exitMenu = false;
        System.out.println("Welcome to Darts!");
        Scores scoring = new Scores();
        scoring.setScores();
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("1-Player Menu");
            System.out.println("2-Game Menu");
            System.out.println("3-Start Game");
            System.out.println("4-Exit");
            Integer selection = Integer.parseInt(input.nextLine());
            switch (selection){
                case 1:
                    exitMenu = false;
                    do{
                        System.out.println("Player Menu");
                        System.out.println("1-View Players");
                        System.out.println("2-Add Player");
                        System.out.println("3-Delete Player");
                        System.out.println("4-Exit");
                        Integer menuSelection = Integer.parseInt(input.nextLine());
                        switch (menuSelection) {
                            case 1:
                                for (Player player:players){
                                    System.out.println(player.getName());
                                }
                                break;
                            case 2:
                                System.out.println("Please enter new players name: ");
                                String name = input.nextLine();
                                Player newPlayer = new Player(name);
                                players.add(newPlayer);
                                break;
                            case 3:
                                System.out.println("Please enter players name you would like to delete: ");
                                String nameDeleted = input.nextLine();
                                for(int i = 0; i < players.size();i++){
                                    if(players.get(i).getName().toLowerCase().contains(nameDeleted.toLowerCase())) {
                                        players.remove(i);
                                        break;
                                    };

                                }
                                break;
                            case 4:
                                exitMenu=true;
                                break;
                        }
                    }while (!exitMenu);
                    break;

                case 2:
                    exitMenu=false;
                    do {
                        System.out.println("Game Menu");
                        System.out.println("Note: Not required to throw double or bullseye to win game.");
                        System.out.println("1-501");
                        System.out.println("2-301");
                        System.out.println("3-Custom");
                        System.out.println("4-Exit");
                        selection = Integer.parseInt(input.nextLine());
                        switch (selection) {
                            case 1:
                                for (Player player:players){
                                    player.setScore(501);
                                }
                                break;
                            case 2:
                                for (Player player:players){
                                    player.setScore(301);
                                }
                                break;
                            case 3:
                                System.out.println("Please enter starting score:");
                                Integer score = Integer.parseInt(input.nextLine());
                                for(Player player: players){
                                    player.setScore(score);
                                }
                                break;
                            case 4:
                                exitMenu = true;
                                break;
                        }
                    } while (!exitMenu);
                    break;

                case 3:
                    exitMenu = false;
                    do{
                        for (Player player:players){
                            System.out.println(players);
                            Integer playerOriginalScore=player.getScore();
                            Integer playerNewScore;
                            for (int i=1;i<=3; i++){
                                playerNewScore = player.getScore();
                                Integer scoreChange = 0;
                                System.out.println(player.getName() +": "+ "Please enter score code:");
                                String scoreCode = input.nextLine().toUpperCase();
                                if(scoring.getScores().containsKey(scoreCode)){
                                    scoreChange = scoring.getScores().get(scoreCode);
                                    playerNewScore-=scoreChange;
                                    player.setScore(playerNewScore);
                                }
                                System.out.println(player.getScore() + " : " + scoreChange);
                                if(player.getScore()<0){
                                    player.setScore(playerOriginalScore);
                                    i=i+3;
                                }
                            }
                            if (player.getScore()==0){
                                System.out.println(player.getName() + " wins!!!");
                                exitMenu = true;
                                break;
                            }
                        }
                    } while (!exitMenu);
                    break;

                case 4:
                    System.out.println("Thanks for playing!");
                    exit = true;
                    break;
            }
            System.out.println(players);
        } while (!exit);
        input.close();
    }
}
