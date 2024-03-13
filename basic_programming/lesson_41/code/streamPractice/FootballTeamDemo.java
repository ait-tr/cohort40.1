package lesson_41.code.streamPractice;

import java.util.Arrays;
import java.util.List;

public class FootballTeamDemo {


    /*
    из коллекции команд отобрать:
    - самую сильную
    - все команды из Essen
     */
    public static void main(String[] args) {

        List<FootballTeam> footballTeams = Arrays.asList(
                new FootballTeam("Dusseldorf", 7),
                new FootballTeam("Essen", 4),
                new FootballTeam("Cologne", 5),
                new FootballTeam("Dortmund", 6),
                new FootballTeam("Bonn", 3),
                new FootballTeam("Berlin", 6),
                new FootballTeam("Leipzig", 5),
                new FootballTeam("Essen 2", 3),
                new FootballTeam("Essen 3", 3)
                );
    }
}
