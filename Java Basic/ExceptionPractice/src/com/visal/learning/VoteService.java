package com.visal.learning;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashSet;
import java.util.Set;

public class VoteService {
    Set<Voter> voters = new HashSet<>();
    static int count = 1;
    void register(Person person){
        validate(person);
        Voter voter = new Voter();
        voter.setPerson(person);
        voter.setLocation("Phnom Penh");
        voter.setCode("PP" + count);
        voter.setId(1L);
        voters.add(voter);
        FileService.Save(voter.toString());
    }
    private void validate(Person person){
        if(person == null) throw new RuntimeException("person cannot be null");
        Period period = Period.between(person.getDateOfBirth(), LocalDate.now());
        if(period.getYears() < 18)throw new RuntimeException("Voter not old enough to vote");
        if (person.getIdCard() == null) throw new RuntimeException("Voter must have ID card to register");
    }
    void showVoters(){
        for(Voter voter : voters){
            System.out.println(voter);
        }
    }

}
