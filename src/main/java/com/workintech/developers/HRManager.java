package com.workintech.developers;

public class HRManager extends Employee{
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(int id, String name, double salary, int juniorCapacity, int midCapacity, int seniorCapacity) {
        super(id, name, salary);
        this.juniorDevelopers = new JuniorDeveloper[juniorCapacity];
        this.midDevelopers = new MidDeveloper[midCapacity];
        this.seniorDevelopers = new SeniorDeveloper[seniorCapacity];
    }
    public HRManager(int id, String name, double salary) {
        this(id, name, salary, 10, 10, 10); // Varsayılan kapasite: 10
    }

    public void addEmployee(JuniorDeveloper junior) {
        for (int i = 0; i < juniorDevelopers.length; i++) {
            if (juniorDevelopers[i] == null) {
                juniorDevelopers[i] = junior;
                System.out.println("JuniorDeveloper added at index " + i);
                return;
            }
        }
        System.out.println("No space available in the JuniorDeveloper array!");
    }

    public void addEmployee(MidDeveloper mid) {
        for (int i = 0; i < midDevelopers.length; i++) {
            if (midDevelopers[i] == null) {
                midDevelopers[i] = mid;
                System.out.println("MidDeveloper added at index " + i);
                return;
            }
        }
        System.out.println("No space available in the MidDeveloper array!");
    }

    public void addEmployee(SeniorDeveloper senior) {
        for (int i = 0; i < seniorDevelopers.length; i++) {
            if (seniorDevelopers[i] == null) {
                seniorDevelopers[i] = senior;
                System.out.println("SeniorDeveloper added at index " + i);
                return;
            }
        }
        System.out.println("No space available in the SeniorDeveloper array!");
    }
    @Override
    public void work() {
        System.out.println("HRM Manager's Salary increased by 5%.");
        setSalary(getSalary() * 1.05);
    }
}
