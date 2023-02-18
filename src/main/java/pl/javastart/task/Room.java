package pl.javastart.task;

class Room {
    double area;
    double currentTemperature;
    double minTemperature;
    boolean hasAirConditioner;

    public Room(double area, double currentTemperature, double minTemperature, boolean hasAirConditioner) {
        this.area = area;
        this.currentTemperature = currentTemperature;
        this.minTemperature = minTemperature;
        this.hasAirConditioner = hasAirConditioner;
    }

    boolean lowerTemperature() {
        if (hasAirConditioner && currentTemperature != minTemperature) {
            if (minTemperature > currentTemperature - 1) {
                double deltaT = currentTemperature - minTemperature;
                currentTemperature -= deltaT;
            } else {
                currentTemperature--;
            }
            return true;
        }
        return false;
    }

    String getRoomInfo() {
        String roomInfo = "Informacje o pokoju:\n"
                + "Metraż: " + area + " m2\n"
                + "Aktualna temperatura: " + currentTemperature + " C\n"
                + "Minimalna temperatura: " + minTemperature + " C\n"
                + "Czy pokój jest klimatyzowany: " + hasAirConditioner;
        return roomInfo;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(double currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public boolean isHasAirConditioner() {
        return hasAirConditioner;
    }

    public void setHasAirConditioner(boolean hasAirConditioner) {
        this.hasAirConditioner = hasAirConditioner;
    }
}
