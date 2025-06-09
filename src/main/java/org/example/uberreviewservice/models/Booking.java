package org.example.uberreviewservice.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Booking extends BaseModel {

    @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.REMOVE}, fetch = FetchType.LAZY)
    private Review driverReview;//we have defined 1 to 1 relt. between booking and review

    @Enumerated(value = EnumType.STRING)
    protected BookingStatus status;

    @Temporal(value = TemporalType.TIMESTAMP)
    private Date startTime;

    @Temporal(value = TemporalType.TIMESTAMP)
    private Date endTime;

    private Long TotalDistance;

    @ManyToOne
    private Driver driver;
    @ManyToOne
    private Passenger passenger;

}
