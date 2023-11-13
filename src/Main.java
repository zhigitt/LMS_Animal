public class Main {
    public static void main(String[] args) {
        Animal shark = new Shark();
        Animal turtle = new Turtle();
        Animal eagle = new Eagle();

        Animal[] massAnimal = {shark, turtle, eagle};

        Shark[] massShark = new Shark[10];
        Turtle[] massTurtle = new Turtle[10];
        Eagle[] massEagle = new Eagle[10];


        for(Animal an: massAnimal){
            if(an instanceof Shark ){
                ((Shark)an).attack();
            } else if(an instanceof Turtle ){
                ((Turtle) an).swim();
            } else if(an instanceof Eagle){
                ((Eagle)an).fly();
            }
        }
    }
}