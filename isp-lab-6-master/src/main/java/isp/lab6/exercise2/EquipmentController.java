package isp.lab6.exercise2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EquipmentController {

    List<Equipment> equipments;

    /**
     * Add new equipment to the list of equipments
     *
     * @param equipment - equipment to be added
     */

    public EquipmentController() {
        equipments = new ArrayList<Equipment>();
    }

    public void addEquipment(final Equipment equipment) {
        equipments.add(equipment);
    }

    /**
     * Get current list of equipments
     *
     * @return list of equipments
     */
    public List<Equipment> getEquipments() {
        return equipments;
    }

    /**
     * Get number of equipments
     *
     * @return number of equipments
     */
    public int getNumberOfEquipments() {
        return equipments.size();
    }

    /**
     * Group equipments by owner
     *
     * @return a dictionary where the key is the owner and value is represented
     * by list of equipments he owns
     */
    public Map<String, List<Equipment>> getEquipmentsGroupedByOwner() {
        HashMap<String, List<Equipment>> map = new HashMap<>();
        for (int i = 0; i < equipments.size(); i++) {
            String owner = equipments.get(i).getOwner();
            List<Equipment> list = map.get(owner);
            if (list == null) {
                list = new ArrayList<Equipment>();
            }
            list.add(equipments.get(i));
            map.put(owner, list);
        }
        return map;
    }

    /**
     * Remove a particular equipment from equipments list by serial number
     *
     * @param serialNumber - unique serial number
     * @return deleted equipment instance or null if not found
     */
    public Equipment removeEquipmentBySerialNumber(final String serialNumber) {
        Equipment equ = null;
        for (int i = 0; i < equipments.size(); i++) {
            if (equipments.get(i).getSerialNumber().equals(serialNumber)) {
                equ = equipments.get(i);
                equipments.remove(i);
                break;
            }
        }
        return equ;
    }

    @Override
    public String toString() {
        return "EquipmentController{" + "equipments=" + equipments + '}';
    }

}
