package aut.utcluj.isp.ex4;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author stefan
 */
public class EquipmentHistory {
    private List<EquipmentHistoryDetails> details=new ArrayList<>();

    /**
     * Add new history details
     *
     * @param owner        - ownen
     * @param operation    - operation ({@link Operation})
     * @param providedDate - provided date of the operation
     */
    public void addEquipmentHistory(final String owner, final Operation operation, final LocalDateTime providedDate) {
        //throw new UnsupportedOperationException("Not supported yet.");
        details.add(new EquipmentHistoryDetails(owner, operation, providedDate));
    }

    public List<EquipmentHistoryDetails> getHistoryDetailsList() {
        return details;
    }
}
