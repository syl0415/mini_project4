package com.aegis.image_shop.common.security.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "serises")
@Entity
@Table(name = "persistent_logins")
public class PersistentLogins {

    @Id
    @Column(length = 64)
    private String serises;

    @Column(length = 64)
    private String username;

    @Column(length = 64)
    private String token;

    @CreationTimestamp
    @Column(name = "last_used")
    private Timestamp lastUsed;

}
