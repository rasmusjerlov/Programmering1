package Exercise3;

import java.util.Random;

public class Player {
    private String name;
    private int age;
    private int score;
    Random random = new Random();

    public Player (String name, int age) {
        this.name = name;
        this.age = age;
        score = random.nextInt(100) + 1;

    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
