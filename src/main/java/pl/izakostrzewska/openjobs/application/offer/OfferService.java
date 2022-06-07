package pl.izakostrzewska.openjobs.application.offer;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OfferService {

    private final OfferMapper offerMapper;
    private final OfferRepository offerRepository;

    public List<OfferDTO> findAll() {
        return offerRepository.findEverything()
                .stream()
                .map(offerMapper::mapToOfferDTO)
                .collect(Collectors.toList());
    }

    public OfferDTO getById(Long offerId) {
        return offerRepository.findById(offerId)
                .map(offerMapper::mapToOfferDTO)
                .orElseThrow(() -> new OfferNotExistsException(offerId));
    }

    public OfferDTO create(OfferDTO offerDTO) {
        return null;
    }
}
