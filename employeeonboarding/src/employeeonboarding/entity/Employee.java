package employeeonboarding.entity;

public class Employee {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String empName;
    private String empId;
    private String empAddress;
    private LocalDate empDOB;
    private LocalDate empDOJ;
    private String phoneNumber;
    private Boolean experienceCertificateUploaded;
    private List<String> skillSets;
    private Integer yearsOfExperience;
    private String alternatePhoneNumber;

    // Getters and Setters
}


