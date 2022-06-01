package pl.izakostrzewska.openjobs.offer;

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
        return offerRepository.findAll()
                .stream()
                .map(offerMapper::mapToOfferDTO)
                .collect(Collectors.toList());
    }
}
