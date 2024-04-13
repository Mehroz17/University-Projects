package com.company;

    public class Address {
        private int houseNumber;
        private String street;
        private String city;
        private String province;
        public Address(int houseNumber, String street, String city, String
                province) {
            setAddress(houseNumber,street,city,province);
        }
        private void setAddress(int houseNumber, String street, String city,
                                String province) {
            this.houseNumber = houseNumber;
            this.street = street;
            this.city = city;
            this.province = province;
        }
        public void getAddress(String location) {
            System.out.println(location + " " + "address is" + " " +
                    houseNumber + " " + street + " " + city + " " + province);
        }
    }

