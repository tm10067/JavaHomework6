package JavaHomework6;

//     Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//     Создать множество ноутбуков (ArrayList).
//     Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
//     Например, спросить у пользователя минимальный размер оперативной памяти или конкретный цвет.
//     Выводить только те ноутбуки, что соответствуют условию

import java.util.ArrayList;

//     Этот класс определяет ноутбуки

public class Notebook {

    //     Задаем поля свойств ноутбуков, конструктор, геттеры и сеттеры

    private String model;
    private String color;
    private double screen_size;
    private String proc_brand;
    private String proc_model;
    private double proc_freq;
    private String gpu_brand;
    private String gpu_model;
    private double gpu_memory;
    private String ram_type;
    private double ram_memory;
    private String hdd_type;
    private int hdd_memory;
    private double price;

    public Notebook(String model, String color, double screen_size, String proc_brand, String proc_model, double proc_freq, String gpu_brand, String gpu_model, double gpu_memory, String ram_type, double ram_memory, String hdd_type, int hdd_memory, double price) {
        this.model = model;
        this.color = color;
        this.screen_size = screen_size;
        this.proc_brand = proc_brand;
        this.proc_model = proc_model;
        this.proc_freq = proc_freq;
        this.gpu_brand = gpu_brand;
        this.gpu_model = gpu_model;
        this.gpu_memory = gpu_memory;
        this.ram_type = ram_type;
        this.ram_memory = ram_memory;
        this.hdd_type = hdd_type;
        this.hdd_memory = hdd_memory;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getScreen_size() {
        return screen_size;
    }

    public void setScreen_size(double screen_size) {
        this.screen_size = screen_size;
    }

    public String getProc_brand() {
        return proc_brand;
    }

    public void setProc_brand(String proc_brand) {
        this.proc_brand = proc_brand;
    }

    public String getProc_model() {
        return proc_model;
    }

    public void setProc_model(String proc_model) {
        this.proc_model = proc_model;
    }

    public double getProc_freq() {
        return proc_freq;
    }

    public void setProc_freq(double proc_freq) {
        this.proc_freq = proc_freq;
    }

    public String getGpu_brand() {
        return gpu_brand;
    }

    public void setGpu_brand(String gpu_brand) {
        this.gpu_brand = gpu_brand;
    }

    public String getGpu_model() {
        return gpu_model;
    }

    public void setGpu_model(String gpu_model) {
        this.gpu_model = gpu_model;
    }

    public double getGpu_memory() {
        return gpu_memory;
    }

    public void setGpu_memory(double gpu_memory) {
        this.gpu_memory = gpu_memory;
    }

    public String getRam_type() {
        return ram_type;
    }

    public void setRam_type(String ram_type) {
        this.ram_type = ram_type;
    }

    public double getRam_memory() {
        return ram_memory;
    }

    public void setRam_memory(double ram_memory) {
        this.ram_memory = ram_memory;
    }

    public String getHdd_type() {
        return hdd_type;
    }

    public void setHdd_type(String hdd_type) {
        this.hdd_type = hdd_type;
    }

    public int getHdd_memory() {
        return hdd_memory;
    }

    public void setHdd_memory(int hdd_memory) {
        this.hdd_memory = hdd_memory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //     Метод для вывода на печать экземпляра ноутбука:

    public void printInfo() {
        System.out.printf("Ноутбук %s: цена %.2f руб.\n", model, price);
        System.out.printf("диагональ: %.1f дюймов\n", screen_size);
        System.out.printf("процессор: %s %s %.1f ГГц\n", proc_brand, proc_model, proc_freq);
        System.out.printf("графика: %s %s %.1f Гб\n", gpu_brand, gpu_model, gpu_memory);
        System.out.printf("RAM: %s %.1f Гб\n", ram_type, ram_memory);
        System.out.printf("жесткий диск: %s %d Гб\n", hdd_type, hdd_memory);
        System.out.printf("цвет: %s\n\n", color);
    }

    //     Метод для вывода на печать списка ноутбуков:

    public static void printInventory(ArrayList<Notebook>inventory) {
        System.out.println("\nНоутбуки в наличии:");
        for(Notebook nbk : inventory){
            nbk.printInfo();
        }
    }
}
