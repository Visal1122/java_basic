package com.visal.learning;

import java.time.LocalDate;

public class VoteApp {
    static void main() {
        Person person = new Person(2l , "Visal Sov" , "Male" , LocalDate.of(2005 , 6 ,12) , "KH01479285");
        VoteService voteService = new VoteService();
        voteService.register(person);
        voteService.showVoters();
    }
}
