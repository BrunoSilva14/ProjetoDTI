package estrutura.service;

import org.springframework.stereotype.Service;

@Service
public class TaxService {
    public float calculateTax(float n) {

        //um if para cada caso 
        if (n <= 22847.76 ) {
            return n;
        }
         if (n > 22847.76 && n<= 33919.8 ) {
            return n*0.75f;
        }

        if (n > 33919.8 && n <= 45012.6 ) {
            return n*0.15f;
        }

        if (n > 45012.6 && n <= 55976.16 ) {
            return n*0.225f;
        }

        if (n > 55976.16 ) {
            return n*0.275f;
        }
    return n;
    }
}