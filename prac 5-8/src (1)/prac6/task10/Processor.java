package prac6.task10;

import java.util.Scanner;

public class Processor implements Fillable{
    String name;
    int clockSpeed;
    int countOfProcessorCores;
    public Processor(String name, int countOfProcessorCores, int clockSpeed){
        this.clockSpeed = clockSpeed;
        this.name = name;
        this.countOfProcessorCores = countOfProcessorCores;
    }

    public Processor() {

    }

    public double getClockSpeed() {
        return clockSpeed;
    }

    public int getCountOfProcessorCores() {
        return countOfProcessorCores;
    }

    public String getName() {
        return name;
    }

    @Override
    public void fill() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название процессора:");
        this.name = in.nextLine();
        System.out.println("Введите количество ядер процессора:");
        this.countOfProcessorCores = in.nextInt();
        System.out.println("Введите тактовую частоту процессора:");
        this.clockSpeed = in.nextInt();

    }

    @Override
    public String toString() {
        return "Processor{" +
                "name='" + name + '\'' +
                ", clockSpeed=" + clockSpeed +
                ", countOfProcessorCores=" + countOfProcessorCores +
                '}';
    }
}
