package com.aegis.image_shop.common.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(of="logNo")
@ToString
@Entity
@Table(name="performance_log")
public class PerformanceLog {

    @Id
    @SequenceGenerator(name = "PERFORMANCE_LOG_SEQUENCE_GEN", sequenceName = "seq_performance_log", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PERFORMANCE_LOG_SEQUENCE_GEN")
    private Long logNo;

    @Column(length = 50, nullable = false)
    private String signatureName;

    @Column(length = 100, nullable = false)
    private String signatureTypeName;

    private Long durationTime;

    @CreationTimestamp
    private LocalDateTime regDate;
    @UpdateTimestamp
    private LocalDateTime updDate;

}
