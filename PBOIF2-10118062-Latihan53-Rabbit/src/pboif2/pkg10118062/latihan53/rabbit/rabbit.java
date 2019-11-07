/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118062.latihan53.rabbit;

/**
 *
 * @author ASUS
 */
public class rabbit extends animal {
    private String color,name;

    public rabbit(String name,boolean vegetarian, String food, int legs,String color) {
        super(vegetarian, food, legs);
        this.name = name;
        this.color = color;
    }

    public String getColor() {
        System.out.println("Peter color is grey");
        return color;
    }

    public String getName() {
        System.out.println("Hello,his name is Peter");
        return name;
    }
            

}
