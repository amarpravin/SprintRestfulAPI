package RestApi;

import model.Department;
import model.Project;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;

@RestController
@RequestMapping("/department/{departmentId}")
public class DepartmentController {


    @GetMapping()
    Department getDepartmentInfo(@PathVariable("departmentId") String departmentId){
        Department department = new Department();
        department.setDepartmentId(1);
        department.setDepartmentName("Finance");

        return department;
    }

    @GetMapping(value = "/project")
    Collection<Project> getProjects(@PathVariable("departmentId")  Integer departmentId) {
        Collection<Project> projectCollection = new ArrayList<>();
        Project project = new Project();
        project.setProjectId(1);
        project.setDepartmentId(departmentId);
        project.setProjectName("Finance Project1");
        projectCollection.add(project);

        project.setProjectId(2);
        project.setDepartmentId(departmentId);
        project.setProjectName("Finance Project2");
        projectCollection.add(project);
        return projectCollection;
    }

    @GetMapping(value = "/project/{projectId}")
    Project getProject(@PathVariable("departmentId") Integer departmentId,
                                   @PathVariable("projectId") Integer projectId) {
        Project project = new Project();
        project.setProjectId(projectId);
        project.setDepartmentId(departmentId);
        project.setProjectName("Finance Project1");
        return project;
    }

    @PostMapping
    public @ResponseBody ResponseEntity<Project> post(@RequestBody Project project) {
        return new ResponseEntity<Project>(project, HttpStatus.BAD_GATEWAY);
    }

}
