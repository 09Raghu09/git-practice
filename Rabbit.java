public class Rabbit extends Animal {
    private String colour;


    public Rabbit(String name, String colour, int age){
        super(name, age);
        this.colour = colour;
    }

    public Rabbit(String name, String colour){
        super(name, 0);
        this.colour = colour;
    }

    public Rabbit(){
        super("Anonymous", 0);
        this.colour = "Brown";
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        if(colour == ""){
            this.colour = "Brown";
        }
        this.colour = colour;
    }

    public String toString(){
        return "Name: " + this.getName() + ", age: " + this.getAge() + ", colour: " + this.getColour();
    }

}

