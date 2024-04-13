package Enumirations;

public enum WorkingLevels2 {
   Level1 ("Student1",8), Level2("Permit Holder ", 8);
    private String name;
    private int wirking;
    //Enum constructor is private , means you can not call it from outside


    WorkingLevels2(String name, int wirking) {
        this.name = name;
        this.wirking = wirking;
    }
}
