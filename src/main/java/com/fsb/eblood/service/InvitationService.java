package com.fsb.eblood.service;


import com.fsb.eblood.dao.entities.Event;
import com.fsb.eblood.dao.entities.Invitation;
import com.fsb.eblood.dao.repositories.InvitationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class InvitationService {

    @Autowired
    private InvitationRepository invitationRepository;

    public Invitation saveInvitation(Invitation invitation){

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        invitation.setCreatedAt(dtf.format(LocalDateTime.now()));
        return invitationRepository.save(invitation);
    }

    public void deleteInvitation(Event event) {
        invitationRepository.deleteByEvent(event);
    }
}
