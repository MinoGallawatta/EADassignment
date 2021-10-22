package com.example.HotelCrud.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.HotelCrud.domain.Hotel;
import com.example.HotelCrud.repository.HotelRepository;
import java.util.List;

@Service
public class HotelService {
	
@Autowired

    private HotelRepository repo;
	public List<Hotel> listAll() {
        return repo.findAll();
    }
    
    public void save(Hotel std) {
        repo.save(std);
    }
    
    public Hotel get(long id) {
        return repo.findById(id).get();
    }
    
    public void delete(long id) {
        repo.deleteById(id);
    }
 
}