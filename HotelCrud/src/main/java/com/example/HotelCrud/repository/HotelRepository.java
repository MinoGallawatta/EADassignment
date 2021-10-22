package com.example.HotelCrud.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
import com.example.HotelCrud.domain.Hotel;
 
 
@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {
 
}