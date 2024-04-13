package LabFriday21;

public enum Cities {

        city1 ("Kariachi","24.8607° N, 67.0011° E"),
        city2 ("Lahore","31.5204° N, 74.3587° E"),
        city3 ("Islamabad","33.6844° N, 73.0479° E"),
        city4("Peshawar","34.0151° N, 71.5249° E");

        private String nameOfCity;
        private String longitudeLatitudes;

        Cities(String nameOfCity, String longitudeLatitudes) {
            this.nameOfCity = nameOfCity;
            this.longitudeLatitudes = longitudeLatitudes;
        }

        public String getNameOfCity() {
            return nameOfCity;
        }

        public String getLongitudeLatitudes() {
            return longitudeLatitudes;
        }
    }

