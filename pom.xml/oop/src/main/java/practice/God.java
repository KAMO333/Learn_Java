package practice;

public class God {
    public static Human[] create(){
       Human[] people = new Human[2];

       people[0] = new Man();
       people[1] = new Woman();

       return people;
    };
}
