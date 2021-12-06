package com.syntax.class26.homework.Insurance;

public abstract class Insurance {
    /* Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour
      as getQuote and cancelInsurance. Create 3 subclasses Car, Pet, Health.
      Car class has it’s own attribute as carModel and Class Pet has petType attribute.
      Create 3 objects of the sub classes and store them in ArrayList.
      Using for loop/advanced for loop/ iterator access all methods of the class.*/
    String insuranceName;

    Insurance(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    abstract void getQuote();

    abstract void cancelInsurance();
}

class Car extends Insurance {
    String carModel;

    Car(String insuranceName, String carModel) {
        super(insuranceName);
        this.carModel = carModel;
    }

    @Override
    void getQuote() {
        System.out.println("Getting Car " + carModel + " Quote");
    }

    @Override
    void cancelInsurance() {
        System.out.println("Canceling Car " + carModel + " Insurance");
    }
}

class Pet extends Insurance {
    String petType;

    Pet(String insuranceName, String petType) {
        super(insuranceName);
        this.petType = petType;
    }

    @Override
    void getQuote() {
        System.out.println("Getting " + petType + " Quote");
    }

    @Override
    void cancelInsurance() {
        System.out.println("Canceling " + petType + " Insurance");
    }
}

class Health extends Insurance {
    Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    void getQuote() {
        System.out.println("Getting Health Quote " + insuranceName);
    }

    @Override
    void cancelInsurance() {
        System.out.println("Canceling Health Insurance " + insuranceName);
    }
}
