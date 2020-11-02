package com.Nisrina.Modul3.Komposisi;

public class Cpu {//Class
    private String processor;
    private String gpu;
    private String ram;

    //Constructor
    public Cpu(String processor, String gpu, String ram) {
        this.processor = processor;
        this.gpu = gpu;
        this.ram = ram;
    }

    //output
    public void PrintSpec(){
        System.out.println("- Processor\t: " + processor);
        System.out.println("- GPU\t\t: " + gpu);
        System.out.println("- Ram\t\t: " + ram +" Gb");
        System.out.println();
    }
}

