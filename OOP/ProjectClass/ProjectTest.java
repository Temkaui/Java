public class ProjectTest {
    public static void main(String[] args){
        // Create four Projects in the four different ways
        Project p = new Project();
        Project p2 = new Project("Second Project");
        Project p3 = new Project("Third Project", "This is the project's description.");
        Project p4 = new Project("Fourth Project", "This project is going to be EXPENSIVE.", 100000);

        // Set the name, description, and initialCost of the first project created
        p.setName("My first project ever!");
        p.setDescription("This is an awesome description.");
        p.setCost(400);

        // Print the name and descript of project3
        System.out.println(p3.getName());
        System.out.println(p3.getDescription());

        // Print the information of all the projects
        // p.elevatorPitch();
        // p2.elevatorPitch();
        // p3.elevatorPitch();
        // p4.elevatorPitch();

        // Add all four projects to the portfolio
        // portfolio.addProject(project);
        // portfolio.addProject(project2);
        // portfolio.addProject(project3);
        // portfolio.addProject(project4);

        // Prints the total cost of the Projects in the Portfolio
        // System.out.println(portfolio.getPortfolioCost());
        
        // Shows the information of all projects in the portfolio and the portfolio's total cost
        // portfolio.showPortfolio();
    }
}
