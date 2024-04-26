package inventory;


import java.util.*;

/**
 * Date 26/04/24
 * Time 18:17
 *
 * @author akhilpathivada
 */
public class Inventory {

    private Map<Integer, Product> slotToProductMap;

    private Map<Integer, Integer> productIdToCountMap;

    private Queue<Integer> slotsAvailable;

    public Inventory(int aisleCount) {
        slotsAvailable = new LinkedList<>();
        for (int i = 1; i < aisleCount; ++i) {
            slotsAvailable.add(i);
        }
        slotToProductMap = new HashMap<>();
        productIdToCountMap = new HashMap<>();
    }

    public Product getProductAt(int slotNumber) {
        return slotToProductMap.get(slotNumber);
    }

    public boolean checkIfProductAvailable(int productId) {
        return productIdToCountMap.containsKey(productId);
    }

    public void addProduct(Product product) throws Exception {
        int productId = product.getId();
        int productCount = productIdToCountMap.getOrDefault(productId, 0);
        if (productCount == 0) {
            if (slotsAvailable.isEmpty()) {
                throw new Exception("Out of space");
            }
            slotToProductMap.put(slotsAvailable.poll(), product);
        }
        productIdToCountMap.put(productId, productCount + 1);
    }

    public void deductProductCount(int slotNumber) {
        int productId = slotToProductMap.get(slotNumber).getId();
        int updatedProductCount = productIdToCountMap.get(productId) - 1;
        if (updatedProductCount == 0) {
            productIdToCountMap.remove(productId);
            slotToProductMap.remove(slotNumber);
            slotsAvailable.add(slotNumber);
        } else {
            productIdToCountMap.put(productId, updatedProductCount);
        }
    }

    // other functionality methods
}
