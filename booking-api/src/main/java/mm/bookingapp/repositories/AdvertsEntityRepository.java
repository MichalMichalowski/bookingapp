package mm.bookingapp.repositories;

import mm.bookingapp.entities.AdvertEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdvertsEntityRepository extends JpaRepository<AdvertEntity, Long> {
}
