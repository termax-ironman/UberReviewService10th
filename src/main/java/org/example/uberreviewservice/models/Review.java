package org.example.uberreviewservice.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "booking_review")
@Inheritance(strategy = InheritanceType.JOINED)
public class Review extends BaseModel{

    @Column(nullable = false)
    protected String content;
    protected Double rating;

    @Override
    public String toString() {
        return "Review: "+this.content+" "+this.rating+" "+this.createdAt;
    }
}

//new review(content, reviw)
