package estrutura.controller;

import estrutura.model.TaxRequest;
import estrutura.model.TaxResponse;
import estrutura.service.TaxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TaxController {
    @Autowired
    private TaxService service;

    @PostMapping("/imposto")
    public ResponseEntity<TaxResponse> getTax(@RequestBody TaxRequest request) {
        float result = service.calculateTax(request.getRenda());
        TaxResponse response = new TaxResponse();
        response.setImposto(result);
        return ResponseEntity.ok().body(response);
    }
}