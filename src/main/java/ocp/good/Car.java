package ocp.good;


public class Car implements Vehicle{
	
    private String type;

    Vehicle comfort = new FamilyCar();
    Vehicle sport = new SportCar();

    public void accelerate() {
        // mal uso extender el objeto Car modificándolo:
        if(type.equals("SPORT"))
            comfort.accelerate();
        else if (type.equals("FAMILY"))
        	sport.accelerate();
    }
}
