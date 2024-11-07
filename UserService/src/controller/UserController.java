package controller;

public class UserController {
	
	 @Autowired
	    private UserService userService;

	    @PostMapping
	    public User createUser(@RequestBody User user) {
	        return userService.createUser(user);
	    }

	    @GetMapping("/{id}")
	    public User getUser(@PathVariable Long id) {
	        return userService.getUserById(id);
	    }

	    @PutMapping("/{id}")
	    public User updateUser(@PathVariable Long id, @RequestBody User user) {
	        return userService.updateUser(id, user);
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
	        userService.deleteUser(id);
	        return ResponseEntity.noContent().build();
	    }
	}



