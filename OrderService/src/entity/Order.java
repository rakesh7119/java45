package entity;

public class Order {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private Long userId;
    
    @Column(nullable = false)
    private String product;
    
    @Column(nullable = false)
    private Integer quantity;

    // Getters and setters

}
