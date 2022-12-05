package at.fhtw.ConverterProject.Service;

import org.springframework.stereotype.Service;

@Service
public class ConverterService {

    public Long getSquare(long number)
    {
        return number*number;
    }

}
