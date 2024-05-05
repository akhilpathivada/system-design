/**
 * author: akhilpathivada
 * time: 05/05/24 07:10
 */
package chainofreponsibility;

public class ChainCreator {

    public Manager createChain() {
        HiringManager hiringManager = new HiringManager("C", 100);
        SeniorHiringManager seniorHiringManager = new SeniorHiringManager("B", 200);
        Director director = new Director("A", 500);

        hiringManager.setManager(seniorHiringManager);
        seniorHiringManager.setManager(director);
        return hiringManager;
    }
}
