// Parent class
class Mammals {
    void mam() {
        System.out.println("Inside Mammals Class");
    }
}

// Child class Lion inherits from Mammals
class Lion extends Mammals {
    void roar() {
        System.out.println("Inside Lion Class");
    }
}

// Child class Human inherits from Mammals
class Human extends Mammals {
    void hum() {
        System.out.println("Inside Human Class");
    }
}

// Main class to run the program
class Main {
    public static void main(String args[]) {
        // Create an object of the Lion class
        Lion lionObj = new Lion();
        lionObj.roar(); // Calls method from Lion class
        lionObj.mam(); // Calls method from parent class Mammals

        // Create an object of the Human class
        Human humanObj = new Human();
        humanObj.hum(); // Calls method from Human class
        humanObj.mam(); // Calls method from parent class Mammals
    }
}
