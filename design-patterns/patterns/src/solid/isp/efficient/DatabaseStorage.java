package solid.isp.efficient;

public interface DatabaseStorage extends Storage {

    public void save();

    public void delete();

    public void update();

    public void fetch();
}
