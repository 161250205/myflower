package com.flower.flower.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@Table(name="f_user")
@NoArgsConstructor
@AllArgsConstructor
public class user {
    @Id
    String id;
    String password;
    String type;
}
