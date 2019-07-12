package com.shandesh.dao;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "APPUSER")
public class AppUserDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    Long userId;

    @Column(name = "USER_NAME")
    String userName;

    @Column(name = "USER_FIRST_NAME")
    String userFirstName;

    @Column(name = "USER_LAST_NAME")
    String userLastName;

    @Column(name = "LAST_UPDATED_BY")
    String lastUpdatedBy;

    @Column(name = "LAST_UPDATED_DATE")
    Timestamp lastUpdatedDate;
}
