package com.aegis.image_shop.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(of="noticeNo")
@ToString
@Entity
@Table(name="notice")
public class Notice {

	@Id
	@SequenceGenerator(name = "NOTICE_SEQUENCE_GEN", sequenceName = "seq_notice", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "NOTICE_SEQUENCE_GEN")
	private Long noticeNo;

	@NotBlank
	@Column(length = 200, nullable = false)
	private String title;

	@Lob
	private String content;

	@CreationTimestamp
	private LocalDateTime regDate;
	@UpdateTimestamp
	private LocalDateTime updDate;

}
