import java.util.Arrays;

public class Farm {
    private String address;
    private Animal[] animals;
    private String ownerName;

    public Farm(String address, Animal[] animals, String ownerName) {
        this.address = address;
        this.ownerName = ownerName;
        this.animals = animals;
    }

    @Override
    public String toString() {
        return "Farm" + "\n" +
               "Address: " + address  + "\n" +
               "Animal: " + Arrays.toString(animals) + "\n" +
               "OwnerName: " + ownerName + "\n";
    }
}
