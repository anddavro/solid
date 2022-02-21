package lsp.good;

public class Main {

    public static void main(String[] args) {

        String carType = "electric";

        Vehicle combusion = new CombustionCar();
        Vehicle electric = new ElectricCar();
        combusion.accelerate();
        electric.accelerate();

        if ("car" == carType) {
            combusion.accelerate();
        } else if ("electric" == carType) {
        	ElectricCar electricCar = new ElectricCar();
            if ((electricCar.hasBattery())) {
                electric.accelerate();
            }
        }else{
            throw new RuntimeException("Invalid car");
        }
    }
    
}
