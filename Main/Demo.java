package Main;

import Classes.ClassFactory;

public class Demo {

    public static void main(String[] args){
        Character character = new Character("Dasda", ClassFactory.getClass("Druid"));

        character.setAttributes(Stats.generate());
        character.printSheet();

    }
}