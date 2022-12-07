package prac6.task10;

import java.util.Scanner;

public class Computer implements Fillable{
    String model;
    String company;
    Processor processor = new Processor();
    Monitor monitor = new Monitor();
    Memory memory = new Memory();
    public Computer (){}
    public Computer(String company, String model, Processor processor,
    Monitor monitor, Memory memory){
        switch (company) {
            case "Lenovo":
                this.company = Companies.LENOVO.getTitle();
                break;
            case "Acer":
                this.company = Companies.ACER.getTitle();
                break;
            case "Intel":
                this.company = Companies.INTEL.getTitle();
                break;
            default:
                break;
        }
        this.model=model;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public Memory getMemory() {
        return memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }
    public Processor getProcessor() {
        return processor;
    }
    @Override
    public void fill() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите модель компьютера:");
        this.model = in.nextLine();
        boolean isCompany = false;
        while (!isCompany){
            System.out.println("Введите производителя:");
            isCompany = true;
            switch (in.nextLine()) {
                case "Lenovo":
                    this.company = Companies.LENOVO.getTitle();
                    break;
                case "Acer":
                    this.company = Companies.ACER.getTitle();
                    break;
                case "Intel":
                    this.company = Companies.INTEL.getTitle();
                    break;
                default:
                    System.out.println("Попробуйте еще раз");
                    isCompany = false;
                    break;
            }
        }
        processor.fill();
        monitor.fill();
        memory.fill();

    }

    @Override
    public String toString() {
        return "Computer{" +
                "model='" + model + '\'' +
                ", company='" + company + '\'' +
                ", processor=" + processor +
                ", monitor=" + monitor +
                ", memory=" + memory +
                '}';
    }
    public enum Companies {
        ACER ("Acer"),
        LENOVO ("Lenovo"),
        INTEL ("Intel");
        private String title;
        Companies (String title) {
            this.title = title;
        }
        public String getTitle() {
            return title;
        }

    }
}
