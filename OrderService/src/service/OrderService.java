package service;

public class OrderService {
	
	 @Autowired
	    private OrderRepository orderRepository;

	    @Autowired
	    private UserServiceClient userServiceClient;

	    public Order createOrder(Order order) {
	        userServiceClient.verifyUserExists(order.getUserId());
	        return orderRepository.save(order);
	    }

	    public Order getOrderById(Long id) {
	        return orderRepository.findById(id).orElseThrow(() -> new RuntimeException("Order not found"));
	    }

	    public Order updateOrder(Long id, Order order) {
	        Order existingOrder = getOrderById(id);
	        existingOrder.setProduct(order.getProduct());
	        existingOrder.setQuantity(order.getQuantity());
	        return orderRepository.save(existingOrder);
	    }

	    public void deleteOrder(Long id) {
	        orderRepository.deleteById(id);
	    }
	}

