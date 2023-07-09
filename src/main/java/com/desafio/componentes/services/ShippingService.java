package com.desafio.componentes.services;

import com.desafio.componentes.entities.Order;

public class ShippingService {

    public double shipment(Order order) {
        if (order.getBasic() < 100.0) {
            return 20.0;
        } else if (order.getBasic() < 200.0) {
            return 12.0;
        } else {
            return 0.0;
        }
    }

}
