package tours.santamarta.tours.dto;

import lombok.Data;

@Data
public class ReservationDTO {
    private Long id;
    private String clientName;
    private String clientEmail;
    private int numberOfPeople;
    private String reservationDate;
    private Long tourId;
}
// hi
