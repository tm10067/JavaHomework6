package JavaHomework6;

//     Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//     Создать множество ноутбуков (ArrayList).
//     Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
//     Например, спросить у пользователя минимальный размер оперативной памяти или конкретный цвет.
//     Выводить только те ноутбуки, что соответствуют условию

import java.util.ArrayList;
import java.util.stream.Collectors;

//     Этот класс служит для создания паттерна фильтрации ассортимента ноутбуков

public class NotebookSearcher {

    //     Задаем поля для фильтрации, конструктор, геттеры и сеттеры

    private String model;
    private String color;
    private double min_screen_size;
    private double max_screen_size;
    private String proc_brand;
    private String proc_model;
    private double min_proc_freq;
    private double max_proc_freq;
    private String gpu_brand;
    private String gpu_model;
    private double min_gpu_memory;
    private double max_gpu_memory;
    private String ram_type;
    private double min_ram_memory;
    private double max_ram_memory;
    private String hdd_type;
    private int min_hdd_memory;
    private int max_hdd_memory;
    private double min_price;
    private double max_price;


    public NotebookSearcher setModel(String model) {
        this.model = model;
        return this;
    }
    public NotebookSearcher setColor(String color) {
        this.color = color;
        return this;
    }
    public NotebookSearcher setMin_screen_size(double min_screen_size) {
        this.min_screen_size = min_screen_size;
        return this;
    }
    public NotebookSearcher setMax_screen_size(double max_screen_size) {
        this.max_screen_size = max_screen_size;
        return this;
    }
    public NotebookSearcher setProc_brand(String proc_brand) {
        this.proc_brand = proc_brand;
        return this;
    }
    public NotebookSearcher setProc_model(String proc_model) {
        this.proc_model = proc_model;
        return this;
    }
    public NotebookSearcher setMin_proc_freq(double min_proc_freq) {
        this.min_proc_freq = min_proc_freq;
        return this;
    }
    public NotebookSearcher setMax_proc_freq(double max_proc_freq) {
        this.max_proc_freq = max_proc_freq;
        return this;
    }
    public NotebookSearcher setGpu_brand(String gpu_brand) {
        this.gpu_brand = gpu_brand;
        return this;
    }
    public NotebookSearcher setGpu_model(String gpu_model) {
        this.gpu_model = gpu_model;
        return this;
    }
    public NotebookSearcher setMin_gpu_memory(double min_gpu_memory) {
        this.min_gpu_memory = min_gpu_memory;
        return this;
    }
    public NotebookSearcher setMax_gpu_memory(double max_gpu_memory) {
        this.max_gpu_memory = max_gpu_memory;
        return this;
    }
    public NotebookSearcher setRam_type(String ram_type) {
        this.ram_type = ram_type;
        return this;
    }
    public NotebookSearcher setMin_ram_memory(double min_ram_memory) {
        this.min_ram_memory = min_ram_memory;
        return this;
    }
    public NotebookSearcher setMax_ram_memory(double max_ram_memory) {
        this.max_ram_memory = max_ram_memory;
        return this;
    }
    public NotebookSearcher setHdd_type(String hdd_type) {
        this.hdd_type = hdd_type;
        return this;
    }
    public NotebookSearcher setMin_hdd_memory(int min_hdd_memory) {
        this.min_hdd_memory = min_hdd_memory;
        return this;
    }
    public NotebookSearcher setMax_hdd_memory(int max_hdd_memory) {
        this.max_hdd_memory = max_hdd_memory;
        return this;
    }
    public NotebookSearcher setMin_price(double min_price) {
        this.min_price = min_price;
        return this;
    }
    public NotebookSearcher setMax_price(double max_price) {
        this.max_price = max_price;
        return this;
    }

    //     Метод для фильтрации списка по полям паттерна с использованием Stream API

    public ArrayList<Notebook> Search(ArrayList<Notebook>inventory) {
        return (ArrayList<Notebook>)inventory.stream()
                .filter(nbk->model == null || nbk.getModel().toLowerCase().contains(model.toLowerCase()))
                .filter(nbk->color == null || nbk.getColor().toLowerCase().contains(color.toLowerCase()))
                .filter(nbk->proc_brand == null || nbk.getProc_brand().toLowerCase().contains(proc_brand.toLowerCase()))
                .filter(nbk->proc_model == null || nbk.getProc_model().toLowerCase().contains(proc_model.toLowerCase()))
                .filter(nbk->gpu_brand == null || nbk.getGpu_brand().toLowerCase().contains(gpu_brand.toLowerCase()))
                .filter(nbk->gpu_model == null || nbk.getGpu_model().toLowerCase().contains(gpu_model.toLowerCase()))
                .filter(nbk->ram_type == null || nbk.getRam_type().toLowerCase().contains(ram_type.toLowerCase()))
                .filter(nbk->hdd_type == null || nbk.getHdd_type().toLowerCase().contains(hdd_type.toLowerCase()))
                .filter(nbk->rangeOfDouble(nbk.getScreen_size(), min_screen_size, max_screen_size))
                .filter(nbk->rangeOfDouble(nbk.getProc_freq(), min_proc_freq, max_proc_freq))
                .filter(nbk->rangeOfDouble(nbk.getGpu_memory(), min_gpu_memory, max_gpu_memory))
                .filter(nbk->rangeOfDouble(nbk.getRam_memory(), min_ram_memory, max_ram_memory))
                .filter(nbk->rangeOf(nbk.getHdd_memory(), min_hdd_memory, max_hdd_memory))
                .filter(nbk->rangeOfDouble(nbk.getPrice(), min_price, max_price))
                .collect(Collectors.toList());
    }

    //     Методы для сравнения числовых полей, задающих промежутки

    private boolean rangeOf(Integer value, Integer min, Integer max) {
        if (min==0 && max==0) return true;
        if (min!=0 && max==0 && min<=value) return true;
        if (max!=0 && min==0 && max>=value) return true;
        if (max!=0 && min!=0 && max>=value && min<=value) return true;
        return false;
    }
    private boolean rangeOfDouble(Double value, Double min, Double max) {
        if (min==0.0 && max==0.0) return true;
        if (min!=0.0 && max==0.0 && min<=value) return true;
        if (max!=0.0 && min==0.0 && max>=value) return true;
        if (max!=0.0 && min!=0.0 && max>=value && min<=value) return true;
        return false;
    }
}
