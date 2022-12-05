package at.fhtw.ConverterProject.Controller;

import at.fhtw.ConverterProject.Service.ConverterService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConverterController {

    private final ConverterService service;

    public ConverterController(ConverterService service) {
        this.service = service;
    }

    @PostMapping("/square/{number}")
    public Long getSquare(@PathVariable Long number)
    {
        return service.getSquare(number);
    }




}
