package LabFriday21;

public class Data {
    private String cityName;

    public Data(String cityName) {
    setCityName(cityName);
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void priting(){
        if(getCityName().equals("Karachi")){
            Cities c1 = Cities.city1;
            System.out.println("Name of City: "+c1.getNameOfCity());
            System.out.println("The coordinates : "+ c1.getLongitudeLatitudes());
        }
        else if(getCityName().equals("Lahore")){
            Cities c2 = Cities.city2;
            System.out.println("Name of city: "+ c2.getNameOfCity());
            System.out.println("The coordinates: "+c2.getLongitudeLatitudes());
        }
        else if(getCityName().equals("Islamabad")){
            Cities c3 = Cities.city3;
            System.out.println("Name of city: "+ c3.getNameOfCity());
            System.out.println("The coordinates: "+c3.getLongitudeLatitudes());
        }
        else if(getCityName().equals("Peshawar")){
            Cities c4 = Cities.city4;
            System.out.println("Name of city: "+ c4.getNameOfCity());
            System.out.println("The coordinates: "+c4.getLongitudeLatitudes());
        }

        else {
            System.out.println("Invalid City Name");
        }
    }


}
