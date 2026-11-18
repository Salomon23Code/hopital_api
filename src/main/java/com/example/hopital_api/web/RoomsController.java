package com.example.hopital_api.web;


import com.example.hopital_api.dto.BillDto;
import com.example.hopital_api.models.Rooms;
import com.example.hopital_api.services.serviceimp.RoomServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v/ro")
public class RoomsController {

    @Autowired
    RoomServicesImpl roomServices;

    @PostMapping("/rooms")
    void creerBill(@RequestBody Rooms rooms){
        this.roomServices.creerRooms(rooms);
    }
}
