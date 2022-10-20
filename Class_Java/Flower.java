class Flower{

String name;
String colour;
int NoOfPetals;

void sheddingFragrance(){
System.out.println(colour+" "+name+" is shedding fragrance...!");
}

void blooming(){
System.out.println(colour+" "+name+" is blooming...!");
}

public static void main(String args[]){

Flower rose = new Flower();

rose.name = "Rose";
rose.colour = "Red";
rose.NoOfPetals = 12;

rose.blooming();
rose.sheddingFragrance();

Flower jasmine = new Flower();

jasmine.name = "Jasmine";
jasmine.colour = "White";
jasmine.NoOfPetals = 5;

jasmine.blooming();
jasmine.sheddingFragrance();

new Flower.blooming();

}

}
