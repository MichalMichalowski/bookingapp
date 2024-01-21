package mm.bookingapp.repositories;

import mm.bookingapp.entities.AdvertEntity;
import mm.bookingapp.models.Advert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import java.util.Map;

public interface AdvertsEntityRepository extends JpaRepository<AdvertEntity, Long> {

    @Procedure(procedureName = "addAdvert", outputParameterName = "newAdvertId")
    Long addAdvert(
            @Param("userId") Long userId,
            @Param("placeName") String placeName,
            @Param("placeDescription") String placeDescription,
            @Param("cityName") String cityName,
            @Param("streetName") String streetName,
            @Param("postalCode") String postalCode,
            @Param("streetNum") Long streetNum,
            @Param("apartmentNum") Long apartmentNum
    );

}