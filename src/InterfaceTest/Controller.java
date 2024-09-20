package InterfaceTest;

public class Controller {

    private final ProductService productService;
    public Controller(ProductService productService){
        this.productService = productService;
    }


    String hapusData(Integer data){

        String result =  productService.deletedProduct(data);
        return result;
    }
    public static void main(String[] args) {
        ProductService productService = new ProductServiceImpl();
        Controller controller = new Controller(productService);
        System.out.println(controller.hapusData(12));
    }
}
