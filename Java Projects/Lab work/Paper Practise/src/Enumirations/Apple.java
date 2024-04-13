package Enumirations;

public enum Apple {

        C("Lahore",56.3),
        C2 ("Multan",45.);
        private String city;
        private double population;

    Apple(String city, double population) {
        this.city = city;
        this.population = population;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

}
