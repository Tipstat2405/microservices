package com.example.userservice.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.io.Serializable;
import java.time.Instant;

@MappedSuperclass
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Data
abstract public class AbstractMappedEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @CreationTimestamp
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @Column(name = "created_at",columnDefinition = "DATETIME")
    private Instant createdAt;

    @UpdateTimestamp
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @Column(name = "updated_at",columnDefinition = "DATETIME")
    private Instant updatedAt;

}