package tours.santamarta.tours.service;

import tours.santamarta.tours.dto.TourDTO;

import java.util.List;

public interface TourService {
    List<TourDTO> getAllTours();
    TourDTO getTourById(Long id);
    TourDTO createTour(TourDTO tourDTO);
    TourDTO updateTour(Long id, TourDTO tourDTO);
    void deleteTour(Long id);
}
