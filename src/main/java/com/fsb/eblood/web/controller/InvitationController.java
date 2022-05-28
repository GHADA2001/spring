package com.fsb.eblood.web.controller;


import com.fsb.eblood.dao.entities.Invitation;
import com.fsb.eblood.dao.entities.Event;
import com.fsb.eblood.service.InvitationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/invitation")
@CrossOrigin(origins = "http://localhost:4200/")
public class InvitationController {

    @Autowired
    InvitationService invitationService;

    @PostMapping("/save")
    public Invitation saveInvitation(@RequestBody Invitation invitation){
        return invitationService.saveInvitation(invitation);
    }


    @DeleteMapping("/delete")
    public void deleteInvitation(@RequestBody Event event){

        invitationService.deleteInvitation(event);
    }

}
