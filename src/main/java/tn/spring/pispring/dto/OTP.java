package tn.spring.pispring.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class OTP {
    String identification;
    Date expiredDate;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;


}
