package pl.izakostrzewska.openjobs.application.offer;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/offers")
@RequiredArgsConstructor
public class OfferController {

    private final OfferService offerService;

    @GetMapping
    @PreAuthorize("hasRole('ADMINISTRATOR')")
    public List<OfferDTO> getAll() {
        return offerService.findAll();
    }

    @GetMapping("/{offerId}")
    public OfferDTO getById(@PathVariable Long offerId) {
        return offerService.getById(offerId);
    }

    @PostMapping
    public OfferDTO create(@RequestBody OfferDTO offerDTO) {
        return offerService.create(offerDTO);

    }
}
