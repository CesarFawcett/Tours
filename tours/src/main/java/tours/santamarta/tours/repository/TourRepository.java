package tours.santamarta.tours.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tours.santamarta.tours.model.Tour;

public interface TourRepository extends JpaRepository<Tour, Long> {
}
