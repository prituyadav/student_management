package com.studentinfos.entities;

import javax.persistence.*;

@Entity
@Table(name = "subjects")
public class Subject {
          @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "name")
        private String name;

        public Subject() {

        }
}
