package Exercise3;

import java.util.ArrayList;

public class Team {
        private String name;
        private ArrayList<Player> players;

        public Team(String name) {
                this.name = name;
                this.players = new ArrayList<Player>();
        }

        public String getName() {
                return name;
        }

        public ArrayList<Player> getPlayers() {
                return players;
        }

        public void setPlayers(ArrayList<Player> players) {
                this.players = players;
        }

        public void addPlayer(Player p) {
                players.add(p);
        }
        public void printPlayer() {
                for (Player p : players) {
                        System.out.println(p.toString());
                }
        }
        public double calcAverageAge() {
                double sum = 0;
                for (Player p : players) {
                        sum += p.getAge();
                }
                return sum / players.size();
        }
        public int calcTotalScore() {
                int total = 0;
                for (Player p : players) {
                        total += p.getScore();
                }
                return total;
        }
        public int oldPlayerScore(int minAge) {
                int ops = 0;
                for (Player p : players) {
                        if (p.getAge() >= minAge ) {
                                ops += p.getScore();
                        }
                }
                return ops;
        }
        public double oldPlayerAverage(int minAge) {
                ArrayList<Player> oldPlayers = new ArrayList<Player>();
                double opa = 0;
                for (Player p : players) {
                        if (p.getAge() >= minAge ) {
                                opa += p.getScore();
                                oldPlayers.add(p);
                        }
                }

                return opa / oldPlayers.size();
        }
        public int maxScore() {
                int max = Integer.MIN_VALUE;
                for (Player p : players) {
                        if (p.getScore() > max) {
                                max = p.getScore();
                        }
                }
                return max;
        }
        public ArrayList<String> bestPlayers() {
                ArrayList<String> bestPlayerNames = new ArrayList<String>();
                for (Player p : players) {
                        if (p.getScore() == maxScore()) {
                                bestPlayerNames.add(p.getName());
                        }
                }
                return bestPlayerNames;
        }
        @Override
        public String toString() {
                return "Team{" +
                        "name='" + name +
                        "}";
        }
}
