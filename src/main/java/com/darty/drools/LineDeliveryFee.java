package com.darty.drools;

/**
 *
 * @author mbouziad
 */
public class LineDeliveryFee {
    
    private Long orderItemId;
    
    public LineDeliveryFee() {
        
    }

    public LineDeliveryFee(Long orderItemId) {
        this.orderItemId = orderItemId;
    }

    public Long getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(Long orderItemId) {
        this.orderItemId = orderItemId;
    }
}
