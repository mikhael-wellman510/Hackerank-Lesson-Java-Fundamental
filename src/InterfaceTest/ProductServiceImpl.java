package InterfaceTest;

public class ProductServiceImpl implements ProductService{

    @Override
    public void getProduct() {

    }

    @Override
    public String deletedProduct(Integer id) {

        return "Data : " + id + " Berhasil di hapus";
    }
}
