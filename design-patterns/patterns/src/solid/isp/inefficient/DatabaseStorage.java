/**
 * author: akhilpathivada
 * time: 05/05/24 09:08
 */
package solid.isp.inefficient;

public class DatabaseStorage implements Storage {

    @Override
    public void save() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void update() {

    }

    @Override
    public void fetch() {

    }

    // these 2 methods are not needed by DatabaseStorage, but still we are implementing them
    @Override
    public void addKey() {

    }

    @Override
    public void removeKey() {

    }
}
