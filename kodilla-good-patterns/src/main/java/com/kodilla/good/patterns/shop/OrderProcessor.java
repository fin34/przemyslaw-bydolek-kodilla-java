package com.kodilla.good.patterns.shop;

public class OrderProcessor {

    private InformationService informationService;
    private ShoppingService shoppingService;
    private OrderRepository orderRepository;

    public OrderProcessor(InformationService informationService, ShoppingService shoppingService, OrderRepository orderRepository) {
        this.informationService = informationService;
        this.shoppingService = shoppingService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(OrderRequest orderRequest){
        boolean orderComplited = shoppingService.order(orderRequest.getUser(), orderRequest.getCart());
        if(orderComplited){
            informationService.sentMessage();
            orderRepository.createOrder(orderRequest);
            orderRequest.getCart().getListOfProductInCart().clear();
            return new OrderDto(orderRequest.getUser(), true);
        }
        return new OrderDto(orderRequest.getUser(), false);
    }
}