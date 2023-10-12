public class FuelPump {
    private double fuelPrice;
    private double fuelAmount;

    public FuelPump(double fuelPrice, double fuelAmount) {
        this.fuelPrice = fuelPrice;
        this.fuelAmount = fuelAmount;
    }

    public void refuel(double liters) {
        if (liters <= fuelAmount) {
            double totalPrice = liters * fuelPrice;
            System.out.println("Заправлено " + liters + " літрів палива. Сума до сплати: " + totalPrice + " грн.");
            fuelAmount -= liters;
        } else {
            System.out.println("На АЗС недостатньо палива для заправки " + liters + " літрів.");
        }
    }

    public double calculateTotalRevenue() {
        return fuelAmount * fuelPrice;
    }
}
