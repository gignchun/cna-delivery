
package OrderShipping;

public class Ordered extends AbstractEvent {

    private Long id;
    private Integer qty;
    private Long productId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }
    public Long getProduct() {
        return productId;
    }

    public void setProduct(Long productId) {
        this.productId = productId;
    }
}
