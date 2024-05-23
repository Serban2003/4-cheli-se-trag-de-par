package aut.utcluj.isp.ex5;

import aut.utcluj.isp.ex4.EquipmentHistoryDetails;
import aut.utcluj.isp.ex4.Operation;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author stefan
 */
public class EquipmentHistory implements IEquipmentHistory{
    private List<EquipmentHistoryDetails> historyDetailsList = new ArrayList<>();

    public void addEquipmentHistory(final String owner, final Operation operation, final LocalDateTime providedDate) {
       historyDetailsList.add(new EquipmentHistoryDetails(owner, operation, providedDate));
    }

    public List<EquipmentHistoryDetails> filterEquipmentHistoryByOperation(final Operation operation) {
        List<EquipmentHistoryDetails> filteredEquipmentHistory = new ArrayList<>();
        for(EquipmentHistoryDetails equipmentHistoryDetails : historyDetailsList)
            if(equipmentHistoryDetails.getOperation() == operation)
                filteredEquipmentHistory.add(equipmentHistoryDetails);

        return filteredEquipmentHistory;
    }

    public List<EquipmentHistoryDetails> sortEquipmentHistoryByDateDesc() {
        List<EquipmentHistoryDetails> sortedEquipmentHistory = historyDetailsList;

        sortedEquipmentHistory.sort(Comparator.comparing(EquipmentHistoryDetails::getDate));

        return sortedEquipmentHistory;
    }

    public List<EquipmentHistoryDetails> getHistoryDetailsList() {
        return historyDetailsList;
    }
}
