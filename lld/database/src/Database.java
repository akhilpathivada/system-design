import java.util.HashMap;
import java.util.Map;

/**
 * author: akhilpathivada
 * time: 29/05/24 15:37
 */

public class Database {

    String databaseName;

    Map<String, Table> tableHashMap;

    Date createdAt;

    public Database(String databaseName) {
        this.databaseName = databaseName;
        this.tableHashMap = new HashMap<>();
        this.createdAt = new Date();
    }

    public Table createTable(String tableName) {
        if (tableHashMap.containsKey(tableName)) {
            System.out.println("A table already exists with the given name");
        } else {
            Table table = new Table(tableName);
            tableHashMap.put(tableName, table);
            System.out.println("Table successfully created");
        }
        return tableHashMap.get(tableName);
    }

    public void dropTable(String tableName) {
        tableHashMap.remove(tableName);
        System.out.println("Table successfully dropped");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, Table> getTableHashMap() {
        return tableHashMap;
    }

    public void setTableHashMap(HashMap<String, Table> tableHashMap) {
        this.tableHashMap = tableHashMap;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
