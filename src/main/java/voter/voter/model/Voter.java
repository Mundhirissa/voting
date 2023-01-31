package voter.voter.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

    @Entity
    @Data

    public class Voter {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int voterid;
        private String fname;
        private String lname;
        private String address;
        private String candname;
        private String candposition;
        private String candparty;

    }


