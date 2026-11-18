package com.example.hopital_api.services.serviceimp;

import com.example.hopital_api.models.Rooms;
import com.example.hopital_api.repository.RoomsRepository;
import com.example.hopital_api.services.servicesIn.RoomServiceIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class RoomServicesImpl implements RoomServiceIn {
    @Autowired
    RoomsRepository roomsRepository;
    @Override
    public void creerRooms(Rooms rooms) {
        Rooms rooms1 = new Rooms();
        rooms1.setRoomNo(generetdeNum());
        rooms1.setLocal(rooms.getLocal());
        this.roomsRepository.save(rooms1);

    }

    private static String generetdeNum(){
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<4;i++){
            sb.append("0");
        }
        for(int i=0;i<4;i++){
            sb.append(random.nextInt(2));
        }
        for(int i=0; i<10;i++){
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }
}
