package lesson_41.code.streamPractice.task2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
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

        Comparator<FootballTeam> powerComparator = new Comparator<FootballTeam>() {
            @Override
            public int compare(FootballTeam o1, FootballTeam o2) {
                return Integer.compare(o1.getPower(), o2.getPower());
            }
        };

        FootballTeam maxPowerTeam = footballTeams.stream()
                .max(powerComparator)
                .orElse(null);

        System.out.println(maxPowerTeam);

        FootballTeam maxPowerTeam2 = footballTeams.stream()
                .max(Comparator.naturalOrder())
                .orElse(null);

        System.out.println(maxPowerTeam2);

        FootballTeam maxPowerTeam3 = footballTeams.stream()
                .sorted(Collections.reverseOrder())
//                .skip(footballTeams.size() - 1)
                .findFirst()
                .get();

        System.out.println(maxPowerTeam3);

        List<String> essenTeams = footballTeams.stream()
                .filter(team -> team.getName().contains("Essen"))
                .map(team -> team.getName())
                .toList();

        System.out.println(essenTeams);



    }
}
