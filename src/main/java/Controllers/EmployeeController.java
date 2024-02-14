package Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmployeeController {
    @GetMapping("/employees/{id}")
    getEmployeeDetail(@PathVariable("id")int id) {
//db call->employee1

    }

    }

