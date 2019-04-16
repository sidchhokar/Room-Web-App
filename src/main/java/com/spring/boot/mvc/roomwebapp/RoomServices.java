package com.spring.boot.mvc.roomwebapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class RoomServices {
	private RoomRepository roomRepository;
	
	public RoomServices(RoomRepository roomRepository) {
		super();
		this.roomRepository = roomRepository;
	}
	
	
	public List<Room> getAllRooms() {
		List<Room> rooms = new ArrayList<>();
		this.roomRepository.findAll().forEach(rooms::add);
		return rooms;
	}
	
}
