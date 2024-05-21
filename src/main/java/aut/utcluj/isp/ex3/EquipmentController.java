package aut.utcluj.isp.ex3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author stefan
 */
public class EquipmentController {

    List<Equipment> inventory = new ArrayList<>();

    public void addEquipment(final Equipment equipment) {
        inventory.add(equipment);
    }

    public List<Equipment> getEquipments() {
        return inventory;
    }

    public int getNumberOfEquipments() {
        return inventory.size();
    }

    public Map<String, List<Equipment>> getEquipmentsGroupedByOwner() {
        Map<String, List<Equipment>> inventoryByOwner = new HashMap<>();

        for(Equipment equipment : inventory){
            String owner = equipment.getOwner();
            List<Equipment> equipmentList;

            if(inventoryByOwner.get(owner) == null) equipmentList = new ArrayList<>();
            else equipmentList = inventoryByOwner.get(owner);

            equipmentList.add(equipment);
            inventoryByOwner.put(equipment.getOwner(), equipmentList);
        }

        return inventoryByOwner;
    }

    /**
     * Remove a particular equipment from equipments list by serial number
     * @param serialNumber - unique serial number
     * @return deleted equipment instance or null if not found
     */
    public Equipment removeEquipmentBySerialNumber(final String serialNumber) {
        for(Equipment equipment : inventory)
            if(equipment.getSerialNumber() == serialNumber){
                inventory.remove(equipment);
                return equipment;
            }
        return null;
    }
}
