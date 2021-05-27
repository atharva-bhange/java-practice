package com.company;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No Plot here!";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws(){
        super("Jaws");

    }

    public String plot(){
        return "A shark eats lost of people!";
    }
}

class IndependenceDay extends Movie {

    public IndependenceDay(){
        super("Independence Day");
    }

    @Override
    public String plot(){
        return "Aliens take over earth";
    }
}

class MazeRunner extends Movie {

    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try to escape a maze";
    }
}

class StarWars extends  Movie {
    public StarWars() {
        super("Stark Wars");
    }

    @Override
    public String plot() {
        return "Space movie";
    }
}

class Forgetable extends Movie{
    public Forgetable(){
        super("Forgetable");
    }

    // No plot method
}

public class Main {

    public static void main(String[] args) {

        for(int i =1 ; i < 11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie No "+i+" : "+movie.getName()+"\n"+
                    "Plot: "+movie.plot()+"\n");
        }

    }

    public  static Movie randomMovie(){
        int randomNum = (int) (Math.random() * 5)+1;
        System.out.println("Random number is "+randomNum);

        switch (randomNum){
            case 1:
                return new Jaws();
            case 2:
                return  new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return  new StarWars();
            case 5:
                return new Forgetable();
        }
        return null;
    }

}


