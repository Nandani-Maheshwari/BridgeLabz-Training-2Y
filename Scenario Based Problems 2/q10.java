import java.util.*;

interface ITrackable {
    void startWorkout();
    void stopWorkout();
}

class UserProfile {
    private String name;
    private int age;
    private double weight;
    private double dailyGoal;
    private List<Workout> workoutLogs;

    public UserProfile(String name, int age, double weight) {
        this(name, age, weight, 500);
    }

    public UserProfile(String name, int age, double weight, double dailyGoal) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.dailyGoal = dailyGoal;
        workoutLogs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getDailyGoal() {
        return dailyGoal;
    }

    public void logWorkout(Workout workout) {
        workoutLogs.add(workout);
    }

    public double totalCaloriesBurned() {
        double total = 0;
        for (Workout w : workoutLogs) {
            total += w.calculateCalories();
        }
        return total;
    }

    public double remainingCalories() {
        return dailyGoal - totalCaloriesBurned();
    }
}

abstract class Workout implements ITrackable {
    private String type;
    private int duration;
    private double caloriesBurned;
    private boolean isActive;

    public Workout(String type, int duration) {
        this.type = type;
        this.duration = duration;
        this.caloriesBurned = 0;
        this.isActive = false;
    }

    public String getType() {
        return type;
    }

    public int getDuration() {
        return duration;
    }

    public double getCaloriesBurned() {
        return caloriesBurned;
    }

    protected void setCaloriesBurned(double calories) {
        this.caloriesBurned = calories;
    }

    @Override
    public void startWorkout() {
        isActive = true;
    }

    @Override
    public void stopWorkout() {
        isActive = false;
    }

    public abstract double calculateCalories();
}

class CardioWorkout extends Workout {
    public CardioWorkout(int duration) {
        super("Cardio", duration);
    }

    @Override
    public double calculateCalories() {
        double calories = getDuration() * 10;
        setCaloriesBurned(calories);
        return calories;
    }
}

class StrengthWorkout extends Workout {
    public StrengthWorkout(int duration) {
        super("Strength", duration);
    }

    @Override
    public double calculateCalories() {
        double calories = getDuration() * 8;
        setCaloriesBurned(calories);
        return calories;
    }
}

public class q10 {
    public static void main(String[] args) {
        UserProfile user = new UserProfile("Amit", 28, 70, 600);

        CardioWorkout cw = new CardioWorkout(30);
        StrengthWorkout sw = new StrengthWorkout(45);

        cw.startWorkout();
        cw.calculateCalories();
        cw.stopWorkout();
        user.logWorkout(cw);

        sw.startWorkout();
        sw.calculateCalories();
        sw.stopWorkout();
        user.logWorkout(sw);

        System.out.println("User: " + user.getName());
        System.out.println("Total Calories Burned: " + user.totalCaloriesBurned());
        System.out.println("Remaining Calories: " + user.remainingCalories());
    }
}

