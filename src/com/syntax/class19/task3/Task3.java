package com.syntax.class19.task3;

public class Task3 {
    /*
    Write a Java program called Teacher. Identify features and behaviour of that Class.
    Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have it their own
    features and behaviour. Test all 4 classes
    */
    public static void main(String[] args) {
        MathTeacher mathTeacher = new MathTeacher();
        mathTeacher.name="Demir";
        mathTeacher.teachMath();

        ChemistryTeacher chemistryTeacher = new ChemistryTeacher();
        chemistryTeacher.name="Emiliya";
        chemistryTeacher.teachChemistry();

        PianoTeacher pianoTeacher = new PianoTeacher();
        pianoTeacher.name="Ann";
        pianoTeacher.teachPiano();

    }
}
class Teacher{
    String name;

    void teach(){
        System.out.println(name + " teaches subjects");
    }
}

class MathTeacher extends Teacher{
    void teachMath(){
        System.out.println(name + " Teaches Math");
    }
}
class ChemistryTeacher extends Teacher{
    void teachChemistry(){
        System.out.println(name + " Teaches Chemistry");
    }
}
class PianoTeacher extends Teacher{
    void teachPiano(){
        System.out.println(name + " Teaches Piano");
    }
}