package mm.bookingapp.repositories;

import mm.bookingapp.entities.PlaceDataViewEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface PlacesEntityRepository extends JpaRepository<PlaceDataViewEntity, Long> {
}
