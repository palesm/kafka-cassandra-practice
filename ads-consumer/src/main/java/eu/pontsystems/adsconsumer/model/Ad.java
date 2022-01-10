package eu.pontsystems.adsconsumer.model;

import lombok.*;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Ad {

    @PrimaryKey
    private UUID id;
    private String name;
    private String message;
}
