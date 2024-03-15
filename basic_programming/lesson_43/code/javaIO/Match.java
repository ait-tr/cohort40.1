package lesson_43.code.javaIO;

import java.util.Calendar;

class Match {
    private Calendar date;
    private String team1, result, team2, stadium;
    private int watchers;

    public Match(Calendar date, String team1, String result, String team2, int watchers, String stadium) {
        this.date = date;
        this.team1 = team1;
        this.result = result;
        this.team2 = team2;
        this.watchers = watchers;
        this.stadium = stadium;
    }

    public int getResult1() {
        return Integer.parseInt(result.split(":")[0]);
    }

    public int getResult2() {
        return Integer.parseInt(result.split(":")[1]);
    }

    public Calendar getDate() {
        return date;
    }

    public String getTeam1() {
        return team1;
    }

    public String getTeam2() {
        return team2;
    }

    public int getWatchers() {
            return watchers;
    }

    public String getStadium() {
        return stadium;
    }

    @Override
    public String toString() {
        return date.get(Calendar.YEAR) + "-" + date.get(Calendar.MONTH) + "-" + date.get(Calendar.DATE) + " " + team1 + " " + getResult1() + ":" + getResult2() + " " + team2 + " " + getWatchers();
    }
}