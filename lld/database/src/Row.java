import java.util.HashMap;

/**
 * author: akhilpathivada
 * time: 29/05/24 15:37
 */

public class Row {

    String rowId;

    HashMap<String, String> columnValuesMap;

    Date createdAt;

    Date updatedAt;

    public Row(String rowId, HashMap<String, String> columnsMap, Date createdAt, Date updatedAt) {
        this.rowId = rowId;
        this.columnValuesMap = columnsMap;
        this.createdAt = createdAt;
        updatedAt = updatedAt;
    }

    public HashMap<String, String> getColumnValuesMap() {
        return columnValuesMap;
    }

    public void setColumnValuesMap(HashMap<String, String> columnValuesMap) {
        this.columnValuesMap = columnValuesMap;
    }

    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return UpdatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        UpdatedAt = updatedAt;
    }
}
