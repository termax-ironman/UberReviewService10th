package org.example.uberreviewservice.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public abstract class BaseModel {

    @Id // this annotation makes the id property a primary key of our table
    @GeneratedValue(strategy = GenerationType.IDENTITY)// IDENTITY MEANS AUTO INCREMENT
    protected Long id;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP) //this annotation tells sping about the froat of data object to be stored i.e Date/Time
    @CreatedDate //this annotation tells spring only handle it for object creation
    protected Date createdAt;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate //this annotation tells spring only handle it for object update
    protected Date updatedAt;
}
