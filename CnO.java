class Animal {
    String name,color,type;
    Animal(String n,String c,String t) {
        name=n;
        color=c;
        type=t;
    }

    void eat() {
        if(type.equals("Herbivor")) {
            System.out.println(name+" is a herbivor and eats grass.");
        }
        else if(type.equals("Carnivor")) {
            System.out.println(name+" is a canrnivor and eats animals.");
        }
        else{
            System.out.println(name+" is omnivor and eats both plants and animals.");
        }
    }

    void live() {
        System.out.println("Domestic animals lives in villages and wild animals lives in forests.");
    }
}

public class CnO {
    public static void main(String args[]) {
        Animal dog=new Animal("Dog","White or black or brown","Omnivor");
        dog.eat();
        dog.live();
        System.out.println();
        Animal cow=new Animal("Cow","White","Herbivor");
        cow.eat();
        cow.live();
        System.out.println();
        Animal lion=new Animal("Lion","Orange","Carnivor");
        lion.eat();
        lion.live();
    }
}

   