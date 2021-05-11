package com.example.demo.domain;

import lombok.*;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name ="PLANNING")
@Data
@RequiredArgsConstructor
//@NoArgsConstructor(force=true)
public class Planning implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private long planningId = 0;

    private  String name;
    @XmlElement(name="name")
    public String getName() {
        return name;
    }

}
