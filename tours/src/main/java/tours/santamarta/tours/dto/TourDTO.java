package tours.santamarta.tours.dto;

import lombok.Data;

@Data
public class TourDTO {
    private Long id;
    private String name;
    private String description;
    private double price;
}
