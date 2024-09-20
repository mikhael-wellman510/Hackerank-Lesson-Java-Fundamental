package Interface;

public class RepositoriImpl implements Repositori{

    @Override
    public Integer number(Integer num) {

        return num + 10;
    }
}
