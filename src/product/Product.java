package product;

public class Product {
    private String nameProduct;
    private String descriptionProduct;
    private double valueProduct;
    private boolean available;

    // Formulário com os dados dos produtos disponiveis.
    public void product(){
        String availableSale = null;
        if (isAvailable()) {
            availableSale = "SIM";
        } else {
            availableSale = "NÃO";
        }

        System.out.println("Nome: " + this.getNameProduct() + "\n" +
                           "Descrição: "+ this.getDescriptionProduct() + "\n" +
                           "Valor: " + this.getValueProduct() + "\n" +
                           "Disponivel para venda? " + availableSale);


    }

    // Listagem de produtos
    public void listing(String newProduct) {
        System.out.println("Nome: " + this.getNameProduct() + "\n" +
                           "Valor do produto: " + this.getValueProduct());

        if (newProduct.equals("sim".toLowerCase())) {
            registerProduct(nameProduct,descriptionProduct,valueProduct);
        }
    }
    // Botão para cadastrar um novo produto.
    public void registerProduct(String nameProduct, String descriptionProduct, double valueProduct) {
        this.setNameProduct(nameProduct);
        this.setDescriptionProduct(descriptionProduct);
        this.setValueProduct(valueProduct);
        listing(nameProduct);
    }
    // Checando a Disponibilidade do Produto.
    public void available(String available) {
        if (available.equals("sim".toLowerCase())) {
            this.setAvailable(true);
        } else if (available.equals("nao".toLowerCase())) {
            this.setAvailable(false);
        }
    }

    // Constructor
    // Iniciando um produto padrão com valor 0, e indisponível para venda.
    public Product() {
        this.setValueProduct(0);
        this.setAvailable(false);
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getDescriptionProduct() {
        return descriptionProduct;
    }

    public void setDescriptionProduct(String descriptionProduct) {
        this.descriptionProduct = descriptionProduct;
    }

    public double getValueProduct() {
        return valueProduct;
    }

    public void setValueProduct(double valueProduct) {
        this.valueProduct = valueProduct;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
