package pl.izakostrzewska.openjobs.offer;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class OfferController {

    private final OfferService offerService;

    @GetMapping("/offers")
    public List<OfferDTO> getAll() {
        return offerService.findAll();
    }
}
