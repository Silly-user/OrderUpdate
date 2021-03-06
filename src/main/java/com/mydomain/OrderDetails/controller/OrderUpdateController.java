package com.mydomain.OrderDetails.controller;

import com.mydomain.OrderDetails.service.IOrderFinderService;
import com.mydomain.OrderDetails.service.OrderFinderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/OrderUpdate")
public class OrderUpdateController {
    Logger logger = LoggerFactory.getLogger(OrderUpdateController.class);
    private IOrderFinderService orderFinderService;

    @Autowired
    public OrderUpdateController(IOrderFinderService orderFinderService) {
        this.orderFinderService = orderFinderService;
    }


    @GetMapping("/updateOrders")
    public String updateOrders() {
        String result = orderFinderService.updateOrders();
        logger.info("Orders update successfully .. !");
        logger.info(result);
        return "Order Updated Successfully .. ! ";
    }

    @GetMapping("/vendors")
    public String showVendors() {
        String result = orderFinderService.getVendors();
        logger.info(result);
        return result;
    }

    @GetMapping("/orders")
    public String showOrders() {
        String result = orderFinderService.getOrders();
        logger.info(result);
        return result;
    }


}
