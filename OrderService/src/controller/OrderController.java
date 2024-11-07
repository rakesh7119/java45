package controller;

public class OrderController {
	
	 @Autowired
	    private OrderService orderService;

	    @PostMapping
	    public Order createOrder(@RequestBody Order order) {
	        return orderService.createOrder(order);
	    }

	    @GetMapping("/{id}")
	    public Order getOrder(@PathVariable Long id) {
	        return orderService.getOrderById(id);
	    }

	    @PutMapping("/{id}")
	    public Order updateOrder(@PathVariable Long id, @RequestBody Order order) {
	        return orderService.updateOrder(id, order);
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteOrder(@PathVariable Long id) {
	        orderService.deleteOrder(id);
	        return ResponseEntity.noContent().build();
	    }

}
