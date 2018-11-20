
import java.util.HashMap;

public class VehicleRegister {

    private HashMap<RegistrationPlate, String> owners;

    public VehicleRegister() {
        owners = new HashMap<RegistrationPlate, String>();
    }

    public VehicleRegister(RegistrationPlate plate, String owner) {
        owners = new HashMap<RegistrationPlate, String>();
    }

    public boolean add(RegistrationPlate plate, String owner) {
        if (owners.containsKey(plate)) {
            return false;
        }
        owners.put(plate, owner);
        return true;
    }

    public String get(RegistrationPlate plate) {
        if (owners.containsKey(plate)) {
            return owners.get(plate);
        }
        return null;
    }

    public boolean delete(RegistrationPlate plate) {
        if (owners.get(plate) == null) {
            return false;
        }
        owners.remove(plate);
        return true;
    }

    public void printRegistrationPlates() {
//        System.out.println(owners + "\n");
        for (RegistrationPlate key : owners.keySet()) {
            System.out.println(key);
        }
    }

    public void printOwners() {
        String[] ownerList = new String[owners.size()];
        int i = 0;
        boolean printList = false;
        for (String thing : owners.values()) {
            ownerList[i] = thing;
            i++;
        }
        for (i = 0; i < ownerList.length; i++) {
            for (int j = i; j < ownerList.length; j++) {
                if (ownerList[j] == ownerList[i]) {
                    printList = false;
                    ownerList[j] = "";
                } else {
                    printList = true;
                }
            if (printList) System.out.println(ownerList[j]);
            }
        }
    }
}

/*
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
public class VehicleRegister {
 
    private Map<RegistrationPlate, String> owners;
 
    public VehicleRegister() {
        owners = new HashMap<RegistrationPlate, String>();
    }
 
    public boolean add(RegistrationPlate plate, String owner) {
        if (owners.containsKey(plate)) {
            return false;
        } 
        owners.put(plate, owner);
        return true;
    }
 
    public String get(RegistrationPlate plate) {
        return owners.get(plate);
    }
 
    public boolean delete(RegistrationPlate plate) {
        if (!owners.containsKey(plate)) {
            return false;
        } 
        owners.remove(plate);
        return true;
    }
 
    public void printRegistrationPlates() {
        for (RegistrationPlate r : owners.keySet()) {
            System.out.println(r);
        }
    }
 
    public void printOwners() {
        List<String> alreadyPrinted = new ArrayList<String>();
 
        for (String owner : owners.values()) {
            if (!alreadyPrinted.contains(owner)) {
                System.out.println(owner);
                alreadyPrinted.add(owner);
            }
        }
    }
}
*/
    



