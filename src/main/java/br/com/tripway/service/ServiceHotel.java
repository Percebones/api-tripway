package br.com.tripway.service;

import br.com.tripway.model.Hotel;
import br.com.tripway.repository.HotelREPO;
import org.springframework.stereotype.Service;

@Service
public class ServiceHotel {

    private final HotelREPO HotelREPO;

    public ServiceHotel(HotelREPO hotelREPO) {
        HotelREPO = hotelREPO;
    }


    public Hotel emiteHotel(Hotel hotelDTO) {
        try {
            Hotel hotel = new Hotel();
            hotel.setNomeHotel(hotelDTO.getNomeHotel());
            hotel.setEndereco(hotelDTO.getEndereco());
            hotel.setImagemHotel(hotelDTO.getImagemHotel());
            hotel.setBeneficios(hotelDTO.getBeneficios());
            return HotelREPO.save(hotel);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }


}
