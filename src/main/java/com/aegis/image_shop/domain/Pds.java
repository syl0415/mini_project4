package com.aegis.image_shop.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name="pds")
public class Pds {

    @Id
    @SequenceGenerator(name = "PDS_SEQUENCE_GEN", sequenceName = "seq_pds", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PDS_SEQUENCE_GEN")
    private Long itemId;

    @NotBlank
    private String itemName;

    private String description;

    @OneToMany(cascade= CascadeType.ALL)
    @JoinColumn(name="item_id")
    private List<PdsFile> pdsFiles = new ArrayList<PdsFile>();

    @Transient
    private String[] files;

    private Integer viewCnt = 0;

    @CreationTimestamp
    private LocalDateTime regDate;
    @UpdateTimestamp
    private LocalDateTime updDate;

    public void addItemFile(PdsFile itemFile) {
        pdsFiles.add(itemFile);
    }

    public void clearItemFile() {
        pdsFiles.clear();
    }

}
