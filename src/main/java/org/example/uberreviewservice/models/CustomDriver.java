package org.example.uberreviewservice.models;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomDriver {
    Long id;

    String name;
}
