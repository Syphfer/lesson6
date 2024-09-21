package animals;

public abstract class Animal {
    String name;
    int maxSwim;
    int maxRun;
public void run (int distance){
        if (distance < maxRun) {
            System.out.println(name + " пробежал");
        } else {
            System.out.println(name + " не пробежал");
        }
}

public void swim (int distance) {
    if(maxSwim == 0){
        System.out.println(name + " не умеет плавать");
        return;
    }
        if (distance < maxSwim) {
            System.out.println(name + " проплыл");
        } else {
            System.out.println(name + " утонул");
        }
}
}