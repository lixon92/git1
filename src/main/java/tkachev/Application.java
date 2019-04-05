package tkachev;

import tkachev.model.Project;
import tkachev.repository.ProjectRepository;
import tkachev.service.ProjectService;

public class Application {
    public static void main(String[] args) {
        Project project = new Project();
        ProjectRepository projectRepository = new ProjectRepository();
        ProjectService projectService = new ProjectService();

    }
}
