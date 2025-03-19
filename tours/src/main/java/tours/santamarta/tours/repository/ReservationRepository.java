package tours.santamarta.tours.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tours.santamarta.tours.model.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
