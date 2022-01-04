package eu.pontsystems.adsproducer.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Ad {

    private int id;
    private String name;
    private String message;
}
