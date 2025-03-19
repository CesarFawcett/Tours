package tours.santamarta.tours.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tours.santamarta.tours.dto.TourDTO;
import tours.santamarta.tours.model.Tour;
import tours.santamarta.tours.repository.TourRepository;
import tours.santamarta.tours.service.TourService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TourServiceImpl implements TourService {

    @Autowired
    private TourRepository toursRepository;

    @Override
    public List<TourDTO> getAllTours() {
        return toursRepository.findAll().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public TourDTO getTourById(Long id) {
        Tour tour = toursRepository.findById(id).orElseThrow(() -> new RuntimeException("Tour not found"));
        return convertToDTO(tour);
    }

    @Override
    public TourDTO createTour(TourDTO tourDTO) {
        Tour tour = convertToEntity(tourDTO);
        tour = toursRepository.save(tour);
        return convertToDTO(tour);
    }

    @Override
    public TourDTO updateTour(Long id, TourDTO tourDTO) {
        Tour tour = toursRepository.findById(id).orElseThrow(() -> new RuntimeException("Tour not found"));
        tour.setName(tourDTO.getName());
        tour.setDescription(tourDTO.getDescription());
        tour.setPrice(tourDTO.getPrice());
        tour = toursRepository.save(tour);
        return convertToDTO(tour);
    }

    @Override
    public void deleteTour(Long id) {
        toursRepository.deleteById(id);
    }

    private TourDTO convertToDTO(Tour tour) {
        TourDTO tourDTO = new TourDTO();
        tourDTO.setId(tour.getId());
        tourDTO.setName(tour.getName());
        tourDTO.setDescription(tour.getDescription());
        tourDTO.setPrice(tour.getPrice());
        return tourDTO;
    }

    private Tour convertToEntity(TourDTO tourDTO) {
        Tour tour = new Tour();
        tour.setName(tourDTO.getName());
        tour.setDescription(tourDTO.getDescription());
        tour.setPrice(tourDTO.getPrice());
        return tour;
    }
}
